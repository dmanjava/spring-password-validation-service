package com.whitaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class PasswordValidationServiceApplication {
	
	@RequestMapping
	public String indexPage() {
		return "Pass word Validation Application";
	}
	
	/**
	 * This will be the the entry point for validations
	 * String getIdByValue(@RequestParam("id") String personId){
	 * @return
	 */
	@RequestMapping(value = "/validate")
	public String validate() {
		return "Dude validated!";
	}


	public static void main(String[] args) {
		SpringApplication.run(PasswordValidationServiceApplication.class, args);
	}
}