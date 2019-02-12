package com.ABC_Bank_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ABC_Bank_App.dao.UserDao;
import com.ABC_Bank_App.model.User;
import com.ABC_Bank_App.service.UserService;

@RestController
public class MainController {
	@Autowired
	UserService userService;
	
	int i=0;

	@RequestMapping("/")
	public ModelAndView msg() {
		return new ModelAndView("index");

	}

	@RequestMapping("/register")
	public ModelAndView newPage() {
		return new ModelAndView("SignUp");
	}

	@RequestMapping(value = "/submit1", method = RequestMethod.POST)
	public String newUser(@RequestParam String username, @RequestParam String password,@RequestParam String role , User user) {
		i+=1;
		user.setId(i);
		user.setPassword(password);
		user.setUsername(username);
		user.setRole(role);
		userService.save(user);
		return "inserted";
        
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String username,@RequestParam String password,@RequestParam String role){
		String s=null;
		System.out.println("username" + username + " " + password + " "+ role);
		User user = userService.login(username, password, role);
		System.out.println("**********"+user.getUsername()); 
		System.out.println("..................."+user.getPassword());
		System.out.println("......................."+user.getRole());
		if((user.getPassword().equals(password)&&(user.getRole().equals("admin")))){
			
			return new ModelAndView("admin");
		}
		else if((user.getPassword().equals(password)&&(user.getRole().equals("user")))){
			System.out.println(".........................."+user.getRole());
			return new ModelAndView("user","username",user.getUsername());
		}
		else{
			s="please register";
			return new ModelAndView("index","msg",s);
		}
		
	}
	
}