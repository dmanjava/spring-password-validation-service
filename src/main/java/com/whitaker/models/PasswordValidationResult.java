package com.whitaker.models;

public class PasswordValidationResult implements IPasswordValidationResult {
	
	/**
	 * The password 
	 */
	IPassword password;
	
	PasswordErrorType passwordErrorType;
	
	
	public PasswordValidationResult() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param password
	 */
	public PasswordValidationResult( IPassword password) {
		super();
		this.password = password;
	}

	/**
	 * @return the password
	 */
	public IPassword getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(IPassword password) {
		this.password = password;
	}

	/**
	 * @return the passwordErrorType
	 */
	public PasswordErrorType getPasswordErrorType() {
		return passwordErrorType;
	}

	/**
	 * @param passwordErrorType the passwordErrorType to set
	 */
	public void setPasswordErrorType(PasswordErrorType passwordErrorType) {
		this.passwordErrorType = passwordErrorType;
	}
	
	
	
	
	
	
	
	

}
