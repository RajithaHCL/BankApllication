package com.hcl.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hcl.BankApplication.Model.User;

public interface Accrepository extends JpaRepository<User , Long> {

	//void save(Account account);

	

}
