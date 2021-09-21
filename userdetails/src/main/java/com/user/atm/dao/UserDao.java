package com.user.atm.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.user.atm.models.User;

@Component
public class UserDao {

	private static User user1 = new User("sachin", 123456789L, "03/22", 343, 6321);
	private static User user2 = new User("steven", 123456780L, "03/23", 345, 1568);
	private static User user3 = new User("smith", 123456781L, "06/22", 765, 9745);
	private static User user4 = new User("anderson", 123456782L, "08/25", 980, 4455);
	private static User user5 = new User("david", 123456783L, "12/21", 167, 7907);

	public static List<User> userDetails = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5));

	public List<User> getAllUsers() {
		return userDetails;
	}
	
}
