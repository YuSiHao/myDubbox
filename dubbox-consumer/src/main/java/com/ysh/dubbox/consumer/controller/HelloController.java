package com.ysh.dubbox.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysh.dubbox.api.UserService;
import com.ysh.dubbox.api.model.User;

@RestController
@RequestMapping("/user")
public class HelloController {

	@Autowired
	private UserService userService;

	@RequestMapping("/AllUsers")
	public List<User> findAllUsers() {
		return userService.findAll();
	}
	
	@RequestMapping("/createUser")
	public String createUser() {
		User user = new User();
		user.setId(123);
		user.setName("jack");
		return userService.create(user);
	}

}
