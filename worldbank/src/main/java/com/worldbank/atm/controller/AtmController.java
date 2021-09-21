package com.worldbank.atm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldbank.atm.models.User;

@RestController
public class AtmController {
	
	@GetMapping("/atm/user/{userName}")
	public User getUserDetails() {
		
		
		return null;
	}
}
