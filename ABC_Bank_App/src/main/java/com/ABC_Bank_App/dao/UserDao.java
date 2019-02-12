package com.ABC_Bank_App.dao;


import org.springframework.data.repository.CrudRepository;

import com.ABC_Bank_App.model.User;

public interface UserDao extends CrudRepository<User, Integer>{
	
	User findOneByUsernameAndPasswordAndRole(String username,String password,String role);
	
}
