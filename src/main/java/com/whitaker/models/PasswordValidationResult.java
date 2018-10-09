package com.whitaker.models;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class PasswordValidationResult implements IPasswordValidationResult {
	
	/**
	 * The password 
	 */
	private IPassword password;
	
	private PasswordErrorType passwordErrorType;
	
	private String passwordErrorMessage;
	
	/**
	 * 
	 * @param password
	 */
	public PasswordValidationResult( IPassword password,
			String message,
			PasswordErrorType type) {
		super();
		this.password = password;
		this.passwordErrorMessage = message;
		this.passwordErrorType = type;
	}

	/**
	 * @return the password
	 */
	@Autowired
	public IPassword getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	@Autowired
	public void setPassword(IPassword password) {
		this.password = password;
	}

	/**
	 * @return the passwordErrorType
	 */
	@Autowired
	public PasswordErrorType getPasswordErrorType() {
		return this.passwordErrorType;
	}

	/**
	 * @return the pass word message
	 */
	@Override
	@Autowired
	public String getPasswordErrorMessage() {
		return this.passwordErrorMessage;
	}
	
}
