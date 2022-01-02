package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {
	private static List<user> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		users.add(new user(1, "Kenneth", new Date()));
		users.add(new user(2, "Alice", new Date()));
		users.add(new user(3, "Elena", new Date()));
	}
	
	public List<user> findAll(){
		return users;
	}
	
	public user save(user user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public user findOne(int id) {
		
		for (user user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
}
