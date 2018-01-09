package com.stackroute.activitystream.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.stackroute.activitystream.dao.CircleDAO;
import com.stackroute.activitystream.dao.MessageDAO;
import com.stackroute.activitystream.dao.UserCircleDAO;
import com.stackroute.activitystream.dao.UserDAO;
import com.stackroute.activitystream.model.Message;
import com.stackroute.activitystream.model.UserTag;


/*
* This class is implementing the MessageDAO interface. This class has to be annotated with 
* @Repository annotation.
* @Repository - is an annotation that marks the specific class as a Data Access Object, 
* thus clarifying it's role.
* @Transactional - The transactional annotation itself defines the scope of a single database 
* 					transaction. The database transaction happens inside the scope of a persistence 
* 					context.  
* */
@Repository("messageDAO")
@Transactional
public class MessageDAOImpl implements MessageDAO {

	

	/*
	 * Autowiring should be implemented for the SessionFactory. 
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	 * Autowiring should be implemented for CircleDAO 
	 */
	@Autowired
	private CircleDAO circleDAO;
	
	/*
	 * Autowiring should be implemented for UserDAO. 
	 */
	@Autowired
	private UserDAO userDAO;
	
	/*
	 * Autowiring should be implemented for UserCircleDAO. 
	 */
	@Autowired
	private UserCircleDAO userCircleDAO;

	/*
	 * Retrieve messages from a specific circle. For improved performace, we will
	 * implement retrieving the messages partially by implementing pagination
	 */
	
	private static int pagesize = 8;
	
	public MessageDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Message> getMessagesFromCircle(String circleName, int pageNumber) {
		
		return getCurrentSession().createQuery("from Message where circleName = ? order by postedDate desc")
				.setString(0, circleName).setFirstResult(pagesize * (pageNumber -1)).setMaxResults(pagesize).list() ;
	}

	/*
	 * Retrieve messages between two users. Please note that in a one to one 
	 * conversation, both users can act sometimes as a sender and sometimes as a 
	 * recipient. For improved performace, we will implement retrieving the 
	 * messages partially by implementing pagination
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Message> getMessagesFromUser(String username, String otherUsername, int pageNumber) {
		return getCurrentSession().createQuery(" from Message where senderId = ? and receiverId = ? order by postedDate")
				.setString(0, username).setString(1, otherUsername).setFirstResult(pagesize * (pageNumber -1))
				.setMaxResults(pagesize).list();
	}
	/*
	 * Retrieve messages from all circles subscribed by a specific user. For improved 
	 * performace, we will implement retrieving the messages partially by implementing pagination
	 */
	public List<Message> getMessages(String username, int pageNumber) {
		List<String> myCircles = userCircleDAO.getMyCircles(username);
		List<Message> allMessages = new ArrayList<Message>();
		List<Message> circleStream;
		for(String circleName : myCircles) {
			circleStream = getMessagesFromCircle(circleName, pageNumber);
			if(circleStream!=null) {
				allMessages.addAll(circleStream);
			}
		}
		return allMessages;
	}

	/*
	 * send messages from a specific circle. The posted message should have the current
	 * timestamp as the posted timestamp.
	 */
	public boolean sendMessageToCircle(String circleName, Message message) {
		try {
			message.setPostedDate();
			message.setCircleName(circleName);
			
			if(circleDAO.get(circleName)== null || !(userCircleDAO.getMyCircles(message.getSenderName()).contains(circleName))) {
				return false;
			}
			getCurrentSession().save(message);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Send message to a specific user
	 */
	public boolean sendMessageToUser(String username, Message message) {
		try {
			message.setPostedDate();
			message.setReceiverId(username);
			if((userDAO.get(message.getSenderName())!= null) && userDAO.get(message.getReceiverId())!=null) {
				getCurrentSession().save(message);
				return true;
			}
			return false;
		}catch (Exception e) {
		e.printStackTrace();
			return false;
	}
	}


	/*
	 * Retrieve all the tags available in the messages
	 */
	@SuppressWarnings("unchecked")
	public List<String> listTags() {
		return getCurrentSession().createQuery("select distinct m.tag from Message m").list();
	}

	/*
	 * Retrieve all tags subscribed by a user
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<String> listMyTags(String username) {
		return getCurrentSession().createQuery("select tag from Message where username = ?").setString(0, username).list();
	}
	/*
	 * Retrieve all messages containing a specific tag. For improved performace, we will
	 * implement retrieving the messages partially by implementing pagination
	 */
	@SuppressWarnings("unchecked")
	public List<Message> showMessagesWithTag(String tag, int pageNumber) {
		return getCurrentSession().createQuery("from Message where tag like ? order by postedDate desc")
				.setFirstResult(pagesize * (pageNumber -1)).setMaxResults(pagesize).list();
	}

	/*
	 * Subscribe user to a tag. Please implement validation to check whether the
	 * user and tag both exists.
	 */
	public boolean subscribeUserToTag(String username, String tag) {
		UserTag usertag = new UserTag();
		usertag.setUsername(username);
		usertag.setTag(tag);
		try{
		if(!(listMyTags(username).contains(tag))){
			getCurrentSession().save(usertag);
			return true;
		}
			return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Unsubscribe a user from a tag. Please implement validation to check whether
	 * the user has subscribed to the tag or not
	 */
	public boolean unsubscribeUserToTag(String username, String tag) {
		UserTag usertag = new UserTag();
		usertag.setUsername(username);
		usertag.setTag(tag);
		try{
		if(!(listMyTags(username).contains(tag))){
			getCurrentSession().delete(usertag);
			return true;
		}
			return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}

	}
	/*
	 * Retrieve UserTag object for a username and a tag
	 */
	@SuppressWarnings("deprecation")
	public UserTag getUserTag(String username, String tag) {
		return (UserTag) getCurrentSession().createQuery("from UserTag where username = ? and tag =?").setString(0, username).setString(1, tag);
	}

}
