package com.example.demo.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {
	
	@Autowired
	private MessageSource messageSource;

	@GetMapping(path="/helloworld")
	public String helloWorld() {
		return "HelloWorld";
	}
	
	@GetMapping(path="/helloworldinter")
	public String helloWorldInter(Locale locale) {
		return messageSource.getMessage("hello.world.message", null, locale);
	}
	
	@GetMapping(path="/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HelloWorld");
	}
}
