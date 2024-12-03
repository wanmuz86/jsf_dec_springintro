package com.example.springintro.service;

import org.springframework.stereotype.Component;

// Saying that this will be a component/class/bean
// Managed by Spring 

@Component
public class MessageService {
	
	public String getMessage() {
		return "Welcome to Spring Dependnency Injection";
	}

}
