package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3; 
	
	static {
		users.add(new User(1,"Test1", new Date()));
		users.add(new User(2,"Test2", new Date()));
		users.add(new User(3,"Test3", new Date()));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(int id) {
		for(User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	public User save(User user) {
		// TODO Auto-generated method stub
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
}
