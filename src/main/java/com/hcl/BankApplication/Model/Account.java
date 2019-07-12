package com.hcl.BankApplication.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Aid")
	private int Aid;
	
	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	@Column(name = "Acc_holder")
	private String Acc_holder;
	
	@Column(name = " amount")
	private int amount;
	
	public String getAcc_holder() {
		return Acc_holder;
	}

	public void setAcc_holder(String acc_holder) {
		Acc_holder = acc_holder;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


}
