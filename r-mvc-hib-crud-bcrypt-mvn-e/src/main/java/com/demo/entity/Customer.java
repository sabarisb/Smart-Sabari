package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Valid(Customer_code<>Customer_code)
	@Column(name="Customer_code")
	private int Customer_code;
	
	@Size(min=2, max=30) 
	@Column(name="Customer_name")
	private String Customer_name;
	
	@Size(min=2,max=20)
	@Column(name="Customer_address")
	private String Customer_Address;
	
	@Autowired
	@Size(max=6)
	@Column(name="Customer_pincode")
	private String Customer_pincode;
	
	   @NotEmpty @Email
	@Column(name="Customer_email")
	private String Customer_email;
	   
	   @Size(max=10)
	@Column(name="Contact_number")
	private String Contact_number;
	
	
	 @DateTimeFormat(pattern="MM/dd/yyyy")
	    @NotNull @Past
	@Column(name="Registration_date")
	private String Registration_date;
	 
	@Size(min=2,max=20)
	@Column(name="Created_by")
	private String Created_by;
	
 @DateTimeFormat(pattern="MM/dd/yyyy")
	@Column(name="Modified_date")
	private String Modified_date;
	
	
	
	public Customer() {
		
	}

	
	

	public int getCustomer_code() {
		return Customer_code;
	}


	public void setCustomer_code(int customer_code) {
		Customer_code = customer_code;
	}


	public String getCustomer_name() {
		return Customer_name;
	}


	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}


	public String getCustomer_Address() {
		return Customer_Address;
	}


	public void setCustomer_Address(String customer_Address) {
		Customer_Address = customer_Address;
	}


	public String getCustomer_pincode() {
		return Customer_pincode;
	}


	public void setCustomer_pincode(String customer_pincode) {
		Customer_pincode = customer_pincode;
	}


	public String getCustomer_email() {
		return Customer_email;
	}


	public void setCustomer_email(String customer_email) {
		Customer_email = customer_email;
	}


	public String getContact_number() {
		return Contact_number;
	}


	public void setContact_number(String contact_number) {
		Contact_number = contact_number;
	}


	public String getRegistration_date() {
		return Registration_date;
	}


	public void setRegistration_date(String registration_date) {
		Registration_date = registration_date;
	}


	public String getCreated_by() {
		return Created_by;
	}


	public void setCreated_by(String created_by) {
		Created_by = created_by;
	}


	public String getModified_date() {
		return Modified_date;
	}


	public void setModified_date(String modified_date) {
		Modified_date = modified_date;
	}


	@Override
	public String toString() {
		return "Customer [Customer_code=" + Customer_code + ", Customer_name=" + Customer_name + ", Customer_Address="
				+ Customer_Address + ", Customer_pincode=" + Customer_pincode + ", Customer_email=" + Customer_email
				+ ", Contact_number=" + Contact_number + ", Registration_date=" + Registration_date + ", Created_by="
				+ Created_by + ", Modified_date=" + Modified_date + "]";
	}


}
