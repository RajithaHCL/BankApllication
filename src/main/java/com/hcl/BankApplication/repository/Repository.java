package com.hcl.BankApplication.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.hcl.BankApplication.Model.User;


public interface Repository extends JpaRepository<User , Long> {
	
	
	
	//@Query("select * from bankapplication.user;")
	
}
