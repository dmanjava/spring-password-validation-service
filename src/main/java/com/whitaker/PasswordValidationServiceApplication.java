package com.whitaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class PasswordValidationServiceApplication {
	
	@RequestMapping
	public String indexPage() {
		return "Pass word Validation Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(PasswordValidationServiceApplication.class, args);
	}
}
