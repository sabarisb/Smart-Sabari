                   package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.AMOUNT;
//import com.demo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerAmount {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<AMOUNT> getCustomers() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<AMOUNT> theQuery = currentSession.createQuery("from Customer ORDER BY lastName", AMOUNT.class);

		// execute query and get result list
		List<AMOUNT> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	@Override
	public void saveCustomer(AMOUNT theCustomer) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer ... 
		currentSession.save(theCustomer);
	}

}
