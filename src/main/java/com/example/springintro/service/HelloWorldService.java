package com.example.springintro.service;

public class HelloWorldService {
	
	// Dependency injection
	// Calling another class within our class
	// Ensuring that the other class is created/instatiated before our class is created
	// eg: COnstructor injection
	// Use / call the method of other class, eg: getMessage()
	
	
	// Declare a variable of type MessageService
	
	private final MessageService messageService;
	
	
	// Constructor injection
	// Create the messageService upon creation of HelloWorldService
	
	public HelloWorldService(MessageService messageService) {
		this.messageService = messageService;
	}
	public String sayHello() {
		return messageService.getMessage(); //Return the message from message service
	}

}
