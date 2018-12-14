package com.demo.service;

import java.util.List;

import com.demo.entity.AMOUNT;;

public interface Service {

	public List<AMOUNT> getCustomers();

	public void saveCustomer(AMOUNT theCustomer);
}
