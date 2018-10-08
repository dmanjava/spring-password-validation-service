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
public interface IPasswordValidationService extends IValidationService {
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validate( IPassword password ) throws PasswordValidationException;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateLength( IPassword password ) throws PasswordValidationException;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateAlphaCharacters( IPassword password )  throws PasswordValidationException;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateNumericCharacters( IPassword password )  throws PasswordValidationException;
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public IPasswordValidationResult validateSequenceOfCharacters ( IPassword password )  throws PasswordValidationException;

}
