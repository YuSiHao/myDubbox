package com.ysh.dubbox.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysh.dubbox.api.DemoService;
import com.ysh.dubbox.consumer.util.DubboService;

@RestController
public class UserController {

//	@Autowired
//	private DemoService demoService;
	
	@Autowired
	private DubboService<DemoService> dubboService;

	@RequestMapping("/say")
	public String sayHello(String name) {
		dubboService.setInterfaceClass(DemoService.class);
		DemoService demoService = dubboService.get();
		return demoService.sayHello(name);
	}

}
