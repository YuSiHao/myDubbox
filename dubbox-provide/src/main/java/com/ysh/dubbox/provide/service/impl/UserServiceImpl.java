package com.ysh.dubbox.provide.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ysh.dubbox.api.UserService;
import com.ysh.dubbox.api.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("chandler");
		users.add(user);
		return users;
	}

	@Override
	public String create(User user) {
		return "userId:123df";
	}

}
