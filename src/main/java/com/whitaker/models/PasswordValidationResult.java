package com.whitaker.models;

import java.util.ArrayList;

public class PasswordValidationResult implements IPasswordValidationResult {
	
	/**
	 * The password 
	 */
	IPassword password;
	
	ArrayList<PasswordErrorType> passwordErrorTypes;
	
	
	/**
	 * 
	 * @param password
	 */
	public PasswordValidationResult( IPassword password) {
		super();
		this.password = password;
		this.passwordErrorTypes = new ArrayList<PasswordErrorType>();
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
	public ArrayList<PasswordErrorType> getPasswordErrorTypes() {
		return passwordErrorTypes;
	}

	/**
	 * @param passwordErrorType the passwordErrorType to set
	 */
	public void setPasswordErrorTypes(ArrayList<PasswordErrorType> passwordErrorTypes) {
		this.passwordErrorTypes = passwordErrorTypes;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.models.IPasswordValidationResult#addPasswordErrorType(com.whitaker.models.PasswordErrorType)
	 */
	@Override
	public boolean addPasswordErrorType(PasswordErrorType errortype) {
		return this.passwordErrorTypes.add(errortype);		
	}

	/* (non-Javadoc)
	 * @see com.whitaker.models.IPasswordValidationResult#removePasswordErrorType(com.whitaker.models.PasswordErrorType)
	 */
	@Override
	public boolean removePasswordErrorType(PasswordErrorType errortype) {
		return this.passwordErrorTypes.remove(errortype);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
