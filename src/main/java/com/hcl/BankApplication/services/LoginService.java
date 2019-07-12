package com.hcl.BankApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.BankApplication.Model.User;
import com.hcl.BankApplication.repository.Accrepository;
import com.hcl.BankApplication.repository.Repository;

@Service
public class LoginService {
	
	
	
	
	@Autowired
	Repository repository;
	
    @Autowired
	Accrepository accrepository;
	 
	{
		public User validateUser(String username,String password)
		User u = repository.Login(username,password);
		return u;
	}
	

}
