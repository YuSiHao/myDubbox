package com.ysh.dubbox.api;

import java.util.List;

import com.ysh.dubbox.api.model.User;


public interface UserService {

	List<User> findAll();

	String create(User user);
}
