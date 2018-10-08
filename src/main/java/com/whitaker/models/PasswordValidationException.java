package com.whitaker.models;


public class PasswordValidationException extends Exception {

	PasswordErrorType type;

	public PasswordValidationException() {
		
	}

	
	/**
	 * 
	 * @param type
	 * @param message
	 */
	public PasswordValidationException(PasswordErrorType type, String message) {
		
		super(message);
		this.type = type;
		
	}

	/**
	 * 
	 * @return type
	 */
	public PasswordErrorType getType() {
		return this.type;
	}
	
	/**
	 * 
	 * @param type
	 */
	public void setType( PasswordErrorType type) {
		this.type = type;
	}

}
