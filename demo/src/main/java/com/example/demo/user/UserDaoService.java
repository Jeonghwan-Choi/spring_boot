package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "Karena", new Date()));
		users.add(new User(2, "Alice", new Date()));
		users.add(new User(3, "Foull", new Date()));

	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		
		for (User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
}
