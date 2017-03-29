package com.ysh.dubbox.provide.service.impl;


import org.springframework.stereotype.Service;

import com.ysh.dubbox.provide.service.DemoService;


@Service
public class DemoServiceImpl implements DemoService {
	public DemoServiceImpl() {
		System.out.println("for test demoServiceImpl start");
	}

	public String sayHello(String name) {
		return "Hello " + name;
	}
}
