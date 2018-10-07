package com.whitaker.service;


public class PasswordValidationError extends Exception {

	PasswordValidationError type;

	public PasswordValidationError() {
		
	}

	public PasswordValidationError(PasswordValidationError type, String message) {
		super(message);
		this.type = type;
		
	}

	public PasswordValidationError(PasswordValidationError type, Throwable cause) {
		super(cause);
		this.type =type;
		
	}


}
