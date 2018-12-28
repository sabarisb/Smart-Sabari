package com.demo.dao;

import java.lang.reflect.Member;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
//	@Transactional
	public List<Customer> getCustomers() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer ORDER BY lastName", Customer.class);

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer ... finally LOL
		// currentSession.save(theCustomer);

		// save/upate the customer
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int Customer_code) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Customer theCustomer = currentSession.get(Customer.class, Customer_code);
		return theCustomer;
	}
		
//
//		
//	Customer customer(Customer_id  customer_Id) {
//		theCustomer.update("update members Customer_code=?,Customer_name=?,Customer_addess=?,Customer_pincode =?"+" "
//				+ "Customer_email=?,contact_number=?,Registration_date=?,Created_by=?,Modified_date=?where Customer_id=?");
		
		
	  
	
	


	@Override
	public void deleteCustomer(int Customer_id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", Customer_id);
		
//		public interface MyRepository extends CrudRepository<MyEntity, Long> {
//		    @Modifying
//		    @Transactional
//		    public void deleteByCustomer_id(List<String> Customer_id);
//       }
		

		theQuery.executeUpdate();
	}

}
