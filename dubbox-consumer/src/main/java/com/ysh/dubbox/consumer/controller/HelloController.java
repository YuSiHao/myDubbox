package com.ysh.dubbox.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysh.dubbox.api.DemoService;

@RestController
public class HelloController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/say")
	public String sayHello(String name) {
		return demoService.sayHello(name);
	}

}
