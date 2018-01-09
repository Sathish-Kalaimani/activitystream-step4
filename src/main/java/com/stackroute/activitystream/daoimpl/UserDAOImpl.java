package com.stackroute.activitystream.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.activitystream.dao.UserDAO;
import com.stackroute.activitystream.model.User;

/*
* This class is implementing the UserCircleDAO interface. This class has to be annotated with 
* @Repository annotation.
* @Repository - is an annotation that marks the specific class as a Data Access Object, 
* thus clarifying it's role.
* @Transactional - The transactional annotation itself defines the scope of a single database 
* 					transaction. The database transaction happens inside the scope of a persistence 
* 					context.  
* */
@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * Create a new user
	 */
	public boolean save(User user) {
		try {
			getCurrentSession().save(user);
			getCurrentSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Update an existing user
	 */
	public boolean update(User user) {
		try {
			getCurrentSession().update(user);
			getCurrentSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Remove an existing user
	 */
	public boolean delete(User user) {
		try {
			getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Retrieve all available user
	 */
	@SuppressWarnings("unchecked")
	public List<User> list() {
		return getCurrentSession().createQuery("from User").list();
	}

	/*
	 * validate an user
	 */
	@SuppressWarnings("deprecation")
	public boolean validate(String id, String password) {
		User user = (User) getCurrentSession().createQuery("from User where username = ? and password = ?")
				.setString(0, id).setString(1, password).uniqueResult();
		if (user == null) {
			return false;
		}
		return true;
	}

	/*
	 * Retrieve details of an user
	 */
	public User get(String id) {
		return getCurrentSession().get(User.class, id);

	}

	/*
	 * check whether a user exists with a given userId
	 */
	public boolean exists(String id) {
		User user = getCurrentSession().get(User.class, id);
		if (user == null) {
			return false;
		}
		return true;
	}
}
