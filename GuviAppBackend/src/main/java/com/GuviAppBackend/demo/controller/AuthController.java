package com.GuviAppBackend.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.GuviAppBackend.demo.model.User;

import com.GuviAppBackend.demo.service.UserService;

@RestController
@RequestMapping("/GetAwayGuru")
@CrossOrigin("*")
public class AuthController {
	@Autowired
	private UserService userService;
	

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		
		String username = user.getUsername();
		String password = user.getPassword();
		
		if(username.equals("admin")) {
			return userService.loginUser(username, password);
			
		}else {
			return userService.loginUser(username, password);
		}
		
	}
}
