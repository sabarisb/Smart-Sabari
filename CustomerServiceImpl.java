 package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CustomerAmount;
import com.demo.entity.AMOUNT;;

@Service
public class CustomerServiceImpl implements CustomerService {
	// need to inject customer dao
	@Autowired
	private CustomerAmount customerDAO;

	@Override
	@Transactional
	public List<AMOUNT> getCustomer() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(AMOUNT  theCustomer) {   
		customerDAO.saveCustomer(theCustomer);
	}
}
 