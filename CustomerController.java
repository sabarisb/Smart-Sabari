package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.AMOUNT;
import com.demo.service.Service;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject our customer service
	@Autowired
	private Service Service;
	
	@GetMapping("/list")
	public Float listCustomers(Model theModel) {	
	
			

			//public static void main(String[] args) {
			 FloatlistCustomers(Float Principal,float interst ,float tenure,float numofyears)
			{
				

				float Y,T,S,I,emi;
				interst=interst/100;
				I=interst/numofyears;
				Y=1+I;
				T=Math.pow(Y, tenure);
				S=1/T;
				emi=(Principal*I)/(1-S);
				return listCustomers;
			}
		
		return "list-customers";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
	//	Customer theCustomer = new Customer();
		
	//	theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") AMOUNT theCustomer) {
		
		// save the customer using our service
		Service.saveCustomer(theCustomer);
		
		
		return "redirect:/customer/list";
	}
	
}


