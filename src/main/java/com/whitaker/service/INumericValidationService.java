/**
 * 
 */
package com.whitaker.service;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationException;

/**
 * @author Darnell Whitaker
 *
 */
public interface INumericValidationService {
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateNumericCharacters( IPassword password ) throws PasswordValidationException;

}
