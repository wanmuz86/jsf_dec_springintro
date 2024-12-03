package com.example.springintro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
	
	// Dependency injection
	// Calling another class within our class (depend on another class) 
	// Ensuring that the other class is created/instatiated before our class is created
	// eg: Constructor injection
	// Use / call the method of other class, eg: getMessage()
	
	
	// Declare a variable of type MessageService
	
	private final MessageService messageService;
	
	
	// Constructor injection
	// Create the messageService upon creation of HelloWorldService
	
	// Autowired means I do not need to create the MessageService everytime
	// SPring will ensure that MessageService is created before HelloWorldService is created
	// Spring will inject it into our class
	
	@Autowired
	public HelloWorldService(MessageService messageService) {
		this.messageService = messageService;
	}
	public String sayHello() {
		return messageService.getMessage(); //Return the message from message service
	}

}
