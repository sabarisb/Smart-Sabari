package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.User;

@Repository
public class LoginDAOImpl implements LoginDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer
		// currentSession.save(user);
		// save/update the user
		currentSession.saveOrUpdate(user);
	}

	@Override
	public User validateUser(User user) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		user = currentSession.get(User.class, user.getUserName());
		System.out.println("LoginDAOImpl validateUser(User user)" + user);
		return user;
	}

}
