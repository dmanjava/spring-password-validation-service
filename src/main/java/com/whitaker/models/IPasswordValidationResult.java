package com.whitaker.models;

import java.io.Serializable;


/**
 * @author Darnell Whitaker
 *
 */
public interface IPasswordValidationResult extends Serializable {
	
	public IPassword getPassword();
	
	public void setPassword(IPassword password);
	
	public PasswordErrorType getPasswordErrorType();
	
	public void setPasswordErrorType( PasswordErrorType errortype);

}
