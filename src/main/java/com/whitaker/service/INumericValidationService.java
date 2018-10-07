/**
 * 
 */
package com.whitaker.service;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;

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
	public IPasswordValidationResult validateNumericCharacters( IPassword password );

}
