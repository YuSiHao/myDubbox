package com.ysh.dubbox.provide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ysh.dubbox.api.UserService;
import com.ysh.dubbox.api.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public List<User> testCustomer() {
		List<User> users = userService.findAll();
		return users;
	}
}
