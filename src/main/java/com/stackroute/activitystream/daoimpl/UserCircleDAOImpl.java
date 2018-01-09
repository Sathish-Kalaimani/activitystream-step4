package com.stackroute.activitystream.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.activitystream.dao.CircleDAO;
import com.stackroute.activitystream.dao.UserCircleDAO;
import com.stackroute.activitystream.dao.UserDAO;
import com.stackroute.activitystream.model.UserCircle;

/*
* This class is implementing the UserCircleDAO interface. This class has to be annotated with 
* @Repository annotation.
* @Repository - is an annotation that marks the specific class as a Data Access Object, 
* thus clarifying it's role.
* @Transactional - The transactional annotation itself defines the scope of a single database 
* 					transaction. The database transaction happens inside the scope of a persistence 
* 					context.  
* */
@Repository("userCircleDAO")
@Transactional
public class UserCircleDAOImpl implements UserCircleDAO{
	
	/*
	 * Autowiring should be implemented for the SessionFactory. 
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserCircleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private CircleDAO circleDAO;
	
	
	/*
	 * Add a user to a circle 
	 */
	public boolean addUser(String username, String circleName) {
			
		UserCircle userCircle = new UserCircle(username, circleName);
		try {
		if(userDAO.get(username)!= null && circleDAO.get(circleName)!=null) {
			if(get(username, circleName) == null) {
				getCurrentSession().save(userCircle);
				
			}
		}else
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/*
	 * Remove a user from a circle 
	 */
	public boolean removeUser(String username, String circleName) {
		UserCircle userCircle = get(username, circleName);
		try {
			getCurrentSession().delete(userCircle);
			return true;
		}catch (Exception e) {
		e.printStackTrace();
			return false;
		}
	}
	
	/*
	 * Retrieve unique UserCircle object which contains a specific username 
	 * and circleName 
	 */
	@SuppressWarnings("deprecation")
	public UserCircle get(String username, String circleName) {
		return (UserCircle) getCurrentSession().createQuery("from UserCircle where username = ? and circleName = ?")
				.setString(0, username).setString(1, circleName).uniqueResult();
	}
	
	
	/*
	 * Retrieve all subscribed circles by a user 
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<String> getMyCircles(String username) {
		return getCurrentSession().createQuery("select circleName from UserCircle where username = ?")
				.setString(0, username).list();
	}

}
