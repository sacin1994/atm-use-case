package com.user.atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.atm.ValidationException;
import com.user.atm.models.User;
import com.user.atm.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{userName}")
	public User getUserDetails(@PathVariable String userName) throws ValidationException {
		
		return userService.getUserbyName(userName);
		
	}

}
