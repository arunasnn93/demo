package com.example.demo.helloworld;

public class HelloWorldBean{

	private String message;
	
	public HelloWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.setMessage(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


}
