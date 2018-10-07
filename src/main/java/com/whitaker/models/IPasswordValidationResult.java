package com.whitaker.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Darnell Whitaker
 *
 */
public interface IPasswordValidationResult extends Serializable {
	
	public IPassword getPassword();
	
	public void setPassword(IPassword password);
	
	public ArrayList<PasswordErrorType> getPasswordErrorTypes();
	
	public void setPasswordErrorTypes( ArrayList<PasswordErrorType> errortypes);
	
	public boolean addPasswordErrorType ( PasswordErrorType errortype);
	
	public boolean removePasswordErrorType ( PasswordErrorType errortype);

}
