package com.ABC_Bank_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ABC_Bank_App.model.User;
import com.ABC_Bank_App.service.AccountsService;

@RestController
public class AdminController {
	@Autowired
	AccountsService accservice;
	int i=0;
	
	@RequestMapping("create_new_account")
	public ModelAndView create(){
		return new ModelAndView("new_user");
	}
	
	@RequestMapping("create_user")
	public String create_user(@RequestParam String username, @RequestParam String password,User user){
		i+=1;
		user.setId(i);
		user.setPassword(password);
		user.setUsername(username);
		user.setRole("user");
		accservice.create_user(user);
		return "Created";
	}
	
	@RequestMapping("/submit")
	public String welcome(){
		return "Welcome";
	}
	
}
