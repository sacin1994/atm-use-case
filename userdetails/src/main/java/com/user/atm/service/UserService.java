package com.user.atm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.atm.dao.UserDao;
import com.user.atm.exception.ValidationException;
import com.user.atm.models.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public User getUserbyName(String userName) throws ValidationException {

		if (null == userName) {
			throw new ValidationException("400", "User name must not be empty");
		}

		Optional<User> userDetails = userDao.getAllUsers().stream().filter(user -> user.getUserName().equals(userName))
				.findFirst();

		if (!userDetails.isPresent()) {
			throw new ValidationException("404", "User with name: " + userName + " does not exist");
		}

		return userDetails.get();
	}

	public User getUserbyAccNum(Long accNum) throws ValidationException {

		if (null == accNum) {
			throw new ValidationException("400", "Account number must not be empty");
		}

		Optional<User> userDetails = userDao.getAllUsers().stream().filter(user -> user.getAccNum().equals(accNum))
				.findFirst();

		if (!userDetails.isPresent()) {
			throw new ValidationException("404", "User with account number: " + accNum + " does not exist");
		}

		return userDetails.get();
	}

}	
