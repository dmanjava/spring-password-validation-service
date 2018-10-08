/**
 * 
 */
package com.whitaker.service;

import java.util.ArrayList;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationException;
import com.whitaker.models.PasswordValidationResult;

/**
 * @author Darnell Whitaker
 *
 */
public interface IValidationService {
	
	public IPassword getPassword();
	
	public void setPassword(IPassword password) throws PasswordValidationException;
	
	public ArrayList<IPasswordValidationResult> getValidationResults();
	
	public void setValidationResults(ArrayList<IPasswordValidationResult> validationresults);
	
	public boolean addValidationResult(IPasswordValidationResult result);
	
	public boolean removeValidationResult(IPasswordValidationResult result);
	

}
