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
public interface IPasswordValidationService {
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validate( IPassword password ) throws PasswordValidationError;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateLength( IPassword password ) throws PasswordValidationError;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateAlphaCharacters( IPassword password )  throws PasswordValidationError;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateNumericCharacters( IPassword password )  throws PasswordValidationError;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateSequenceOfCharacters ( IPassword password )  throws PasswordValidationError;

}
