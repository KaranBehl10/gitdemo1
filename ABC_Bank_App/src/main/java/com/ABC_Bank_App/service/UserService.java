package com.ABC_Bank_App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC_Bank_App.dao.UserDao;
import com.ABC_Bank_App.model.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public User save(User user) {
		return userDao.save(user);

	}
	 public User login(String username,String password,String role){
		 return userDao.findOneByUsernameAndPasswordAndRole(username, password, role);
	 }
}
