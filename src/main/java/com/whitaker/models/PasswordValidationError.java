package com.whitaker.models;


public class PasswordValidationError extends Exception {

	PasswordErrorType type;

	public PasswordValidationError() {
		
	}

	
	/**
	 * 
	 * @param type
	 * @param message
	 */
	public PasswordValidationError(PasswordErrorType type, String message) {
		
		super(message);
		this.type = type;
		
	}

	/**
	 * 
	 * @param type
	 * @param cause
	 */
	public PasswordValidationError(PasswordErrorType type, Throwable cause) {
		
		super(cause);
		this.type =type;
		
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
