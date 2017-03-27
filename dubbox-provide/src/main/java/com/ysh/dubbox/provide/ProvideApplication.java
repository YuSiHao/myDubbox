package com.ysh.dubbox.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ProvideApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProvideApplication.class, args);
	}
	
}
