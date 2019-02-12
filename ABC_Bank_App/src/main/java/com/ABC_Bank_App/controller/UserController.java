package com.ABC_Bank_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ABC_Bank_App.dao.AccountsDao;
import com.ABC_Bank_App.model.Accounts;
import com.ABC_Bank_App.service.AccountsService;

@RestController
public class UserController {
	@Autowired
	AccountsService accountsService;

	@RequestMapping("/update_details")
	public ModelAndView update_form() {
		return new ModelAndView("update_form");
	}

	@RequestMapping("/update_new_details")
	public ModelAndView update_page() {
		return new ModelAndView("user");
	}

	@RequestMapping("submit_new_details")
	public String submit(@RequestParam String password, @RequestParam long phonenumber,
			@RequestParam long accountnumber, Accounts accounts) {
		accounts.setAccountnumber(accountnumber);
		accounts.setPassword(password);
		accounts.setPhonenumber(phonenumber);
		accountsService.update_details(accounts);
		System.out.println(accounts.getAccountnumber() + "......." + accounts.getPassword() + ".........."+accounts.getId()+accounts.getPhonenumber());
		return "updated";
	}
}
