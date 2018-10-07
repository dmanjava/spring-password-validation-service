/**
 * 
 */
package com.whitaker.service;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationError;

/**
 * @author Darnell Whitaker
 *
 */
public interface ILengthValidationService {
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateLength( IPassword password ) throws PasswordValidationError;

}
