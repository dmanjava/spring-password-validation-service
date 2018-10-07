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
public interface ICharacterValidationService {
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateAlphaCharacters( IPassword password );
	
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateSequenceOfCharacters ( IPassword password );

}
