package com.GuviAppBackend.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GuviAppBackend.demo.model.User;
import com.GuviAppBackend.demo.service.UserService;

@RestController
@RequestMapping("/GetAwayGuru")
@CrossOrigin("*")
public class UserController {
    @Autowired
	private UserService userService;
    
	@PostMapping("/signup")
	public String signup(@RequestBody User user) {
		
		return userService.createNewuser(user);
		
	}
	
	
	
	
}
