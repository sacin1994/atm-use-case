package com.user.atm.models;

import java.util.List;

public class UserResponse {
	
	List<User> users;
	
	public UserResponse() {
	}

	public UserResponse(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
