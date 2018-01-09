package com.stackroute.activitystream.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.activitystream.dao.CircleDAO;
import com.stackroute.activitystream.dao.UserDAO;
import com.stackroute.activitystream.model.Circle;

/*
* This class is implementing the CircleDAO interface. This class has to be annotated with 
* @Repository annotation.
* @Repository - is an annotation that marks the specific class as a Data Access Object, 
* thus clarifying it's role.
* @Transactional - The transactional annotation itself defines the scope of a single database 
* 					transaction. The database transaction happens inside the scope of a persistence 
* 					context.  
* */
@Repository("circleDAO")
@Transactional
public class CircleDAOImpl implements CircleDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory. 
	 */
	@Autowired
	private SessionFactory sessionFactory;
	/*
	 * Autowiring should be implemented for UserDAO. 
	 */
	@Autowired
	private UserDAO userDAO;
	
	public CircleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
		
	/*
	 * Create a new circle
	 */
	public boolean save(Circle circle) {
		try {
			circle.getCreatedDate();
			if (userDAO.get(circle.getCreatorId()) != null) {
				getCurrentSession().save(circle);
				return true;
			} else
				return false;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Update an existing circle
	 */
	public boolean update(Circle circle) {
		try {
			getCurrentSession().save(circle);
			return true;
		}catch(Exception e) {
		e.printStackTrace();
			return false;
	}
	}

	
	/*
	 * delete an existing circle
	 */
	public boolean delete(Circle circle) {
		try {
			getCurrentSession().delete(circle);
			return true;
		}catch(Exception e) {
		return false;
	}
	}


	/*
	 * Retrieve a specific circle
	 */
	public Circle get(String circleName) {
		return (Circle) getCurrentSession().get(Circle.class, circleName);

	}
	
	/*
	 * retrieving all circles
	 */
	@SuppressWarnings("unchecked")
	public List<Circle> getAllCircles() {
		return getCurrentSession().createQuery("from Circle").list();
	}

	
	/*
	 * Retrieving all circles that matches a search string
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Circle> getAllCircles(String searchString) {
		return getCurrentSession().createCriteria(Circle.class).add(Restrictions.like("circleName", "%"+searchString+"%")).list();

	}	

}
