package com.hcl.BankApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.BankApplication.Model.User;
import com.hcl.BankApplication.services.Userservice;

@RestController
@RequestMapping("/user")

public class Registercontroller {
	
	@Autowired
	Userservice userservice;
	
//@Autowired
//AccServices accService;

	@PostMapping("/register")
	public void createUser(@RequestBody User user){
		userservice.addbankUser(user);
	}
	
	@PostMapping("/login")
	public void login(@RequestBody User user)
	 {
		
		
	
		
	}
	
	
	
}
