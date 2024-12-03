package com.example.springintro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springintro.service.HelloWorldService;
import com.example.springintro.service.MessageService;

// THere are two ways for spring to look for our configuration
// @Configuration 
// <xml>

// We indicate that this is a configuration file,
// Spring will know to look in this file to see the configuration of our Spring Application

@Configuration
public class AppConfig {
	
	// In my project, I will have a class, service HelloWorldService
	
	// THis is a class to be managed by Spring
	// @Bean -> To let Spring knows that there is the class
	// We ask Spring to manage it
	// A class that is managed by Spring => Bean
	
	@Bean  
	public HelloWorldService helloWorldService() {
		return new HelloWorldService(messageService());
	}
	
	
	@Bean
	public MessageService messageService() {
		return new MessageService();
	}
	

}
