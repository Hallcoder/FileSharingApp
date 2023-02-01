package com.jshare.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class JShareApplication {
	public static void main(String[] args) {
		SpringApplication.run(JShareApplication.class, args);
	}
	@RequestMapping("/")
	public String hello(){
		return "Hello world";
	}
}
