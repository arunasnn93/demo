package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {

	@GetMapping(path="/helloworld")
	public String helloWorld() {
		return "HelloWorld";
	}
	
	@GetMapping(path="/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HelloWorld");
	}
}
