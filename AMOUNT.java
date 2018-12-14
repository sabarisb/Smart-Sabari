package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AMOUNT")
public class AMOUNT {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="code")
	private int code;
	@Column(name="LOAN_AMOUNT")
	private Float LOAN_AMOUNT;
	
	@Column(name="RATE_OF_INTEREST")
	private float RATE_OF_INTEREST;
	
	@Column(name="TENURE")
	private float TENURE;

	@Column(name="NO_OF INSTALLMENT")
	private float NO_OF_INSTALLMENT;

	public float getLOAN_AMOUNT() {
		return LOAN_AMOUNT;
	}

	public float getRATE_OF_INTEREST() {
		return RATE_OF_INTEREST;
	}

	public void setRATE_OF_INTEREST(float rATE_OF_INTEREST) {
		RATE_OF_INTEREST = rATE_OF_INTEREST;
	}

	public float getTENURE() {
		return TENURE;
	}

	public void setTENURE(float tENURE) {
		TENURE = tENURE;
	}

	public float getNO_OF_INSTALLMENT() {
		return NO_OF_INSTALLMENT;
	}

	public void setNO_OF_INSTALLMENT(float nO_OF_INSTALLMENT) {
		NO_OF_INSTALLMENT = nO_OF_INSTALLMENT;
	}

	public void setLOAN_AMOUNT(Float lOAN_AMOUNT) {
		LOAN_AMOUNT = lOAN_AMOUNT;
	}

	
	
}