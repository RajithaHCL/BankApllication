package com.hcl.BankApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.BankApplication.Model.Account;
import com.hcl.BankApplication.Model.User;
import com.hcl.BankApplication.repository.Accrepository;
import com.hcl.BankApplication.repository.Repository;


@Service
public class Userservice {
	
	@Autowired
	Repository repository;
	
@Autowired
	Accrepository accrepository;
	
	public void addbankUser(User user){
		repository.save(user);
		Account account=new Account();
		account.setAid(account.getAid());
		account.setAcc_holder(account.getAcc_holder());
		account.setAmount(10000);
		
		
		//accrepository.save(account);
		
	}
	
	


}
