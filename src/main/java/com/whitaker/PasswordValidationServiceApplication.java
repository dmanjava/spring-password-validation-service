package com.whitaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class PasswordValidationServiceApplication {
	
	final String instructions = "Instructions\n" + 
			"\n" + 
			"Write a password validation service, meant to be configurable via IoC (using dependency injection engine of your choice). The service is meant to check a text string for compliance to any number of password validation rules. The rules currently known are:\n" + 
			"\n" + 
			" \n" + 
			"\n" + 
			"·         Must consist of a mixture of lowercase letters and numerical digits only, with at least one of each.\n" + 
			"\n" + 
			"·         Must be between 5 and 12 characters in length.\n" + 
			"\n" + 
			"·         Must not contain any sequence of characters immediately followed by the same sequence.\n" + 
			"\n" + 
			" \n" + 
			"\n" + 
			"For any questions or clarifications, please contact me at rostic.sheykhet@mckesson.com\n" + 
			"\n" + 
			" \n" + 
			"\n" + 
			"Include all artifacts in a zip file and please let us know how many hours you spent on the programming problem. The project should include a build capability in one of the following tools, Eclipse, IntelliJ, ant, or maven. "
			+ "The project should be ready for insertion into a production system. Show tests for the service and any constituent classes involved in fulfillment of the service. Also, show how to access and use the service at runtime.";
	
	@RequestMapping
	public String indexPage() {
		return "Pass word Validation Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(PasswordValidationServiceApplication.class, args);
	}
}
