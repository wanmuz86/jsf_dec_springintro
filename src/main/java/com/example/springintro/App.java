package com.example.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springintro.config.AppConfig;
import com.example.springintro.service.HelloWorldService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Create a context/application with all the configuration defined in AppConfig
    	// Notes that all the configuraion is done with @Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Create a new object, I want Spring to create it for me
        // @Bean -> SPring will create it for us
        HelloWorldService service = context.getBean(HelloWorldService.class);
  
        
        // I call the method sayHello from the object service (HelloWorldService)
        System.out.println(service.sayHello());
        
        HelloWorldService service2 = context.getBean(HelloWorldService.class);
        System.out.println("Are service1 and service2 is the same? "+ (service == service2));
        
        // Close the context/application
        ((AnnotationConfigApplicationContext)context).close();
    }
}
