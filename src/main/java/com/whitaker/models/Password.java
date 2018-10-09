package com.whitaker.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Password implements IPassword {
	
	String password;

	public Password( final String pword) {
		this.password = pword;
	}

	/**
	 * return the password 
	 */
	@Autowired
	public String getPasswordText() {
		
		return this.password;
	}

	/**
	 * set the password
	 */
	@Autowired
	public void setPasswordText(String password) {
		this.password = password;

	}

}
