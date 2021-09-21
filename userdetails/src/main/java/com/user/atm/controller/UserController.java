package com.user.atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.atm.exception.ValidationException;
import com.user.atm.models.Error;
import com.user.atm.models.GenericResponse;
import com.user.atm.models.User;
import com.user.atm.models.UserResponse;
import com.user.atm.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public GenericResponse<UserResponse> getAllUsers() {
		return new GenericResponse<UserResponse>(new UserResponse(userService.getAllUsers()), null);
	}

	@GetMapping("/user/{userName}")
	public GenericResponse<User> getUserDetails(@PathVariable String userName) {

		GenericResponse<User> userResponse;
		User user;

		try {
			user = userService.getUserbyName(userName);
			userResponse = new GenericResponse<User>(user, null);
		} catch (ValidationException ex) {
			userResponse = new GenericResponse<User>(null, new Error(ex.getErrorCode(), ex.getErrorMessage()));
		}
		return userResponse;
	}
	
	@GetMapping("/user/account/{accNum}")
	public GenericResponse<User> getUserDetails(@PathVariable Long accNum) {

		GenericResponse<User> userResponse;
		User user;

		try {
			user = userService.getUserbyAccNum(accNum);
			userResponse = new GenericResponse<User>(user, null);
		} catch (ValidationException ex) {
			userResponse = new GenericResponse<User>(null, new Error(ex.getErrorCode(), ex.getErrorMessage()));
		}
		return userResponse;
	}

}
