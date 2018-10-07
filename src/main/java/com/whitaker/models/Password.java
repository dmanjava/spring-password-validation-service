package com.whitaker.models;

public class Password implements IPassword {
	
	String password;

	public Password() {
		
	}

	/**
	 * return the passwore
	 */
	public String getPasswordText() {
		
		return this.password;
	}

	/**
	 * set the password
	 */
	public void setPasswordText(String password) {
		this.password = password;

	}

}
