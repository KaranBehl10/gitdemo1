package com.ABC_Bank_App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ABC_Bank_App.dao.AccountsDao;
import com.ABC_Bank_App.dao.UserDao;
import com.ABC_Bank_App.model.Accounts;
import com.ABC_Bank_App.model.User;

@Service
public class AccountsService {
	@Autowired
	UserDao userDao;
	
	@Autowired
	AccountsDao accountsDao;
	
	public String create_user(User user){
		userDao.save(user);
		return null;
	}
	
	public String update_details(Accounts accounts){
		accountsDao.save(accounts);
		return "created account";
	}
}
