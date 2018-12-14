package com.demo.dao;

import java.util.List;

import com.demo.entity.AMOUNT;


public interface CustomerAmount {

	public List<AMOUNT> getCustomers();

	public void saveCustomer(AMOUNT theCustomer);

}
