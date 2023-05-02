package com.review2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review2.demo.model.Loginpage;
import com.review2.demo.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService lser;
	
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody Loginpage l)
	{
		System.out.println(l.getUsername());
		return lser.validateUser(l.getUsername(), l.getPassword());
	}
	
	@PostMapping("/addUser")
	public Loginpage addDetails(@RequestBody Loginpage l)
	{
		return lser.saveUser(l);
	}
}
