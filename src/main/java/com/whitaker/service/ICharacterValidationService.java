/**
 * 
 */
package com.whitaker.service;

import java.util.ArrayList;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationException;

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
	public ArrayList<IPasswordValidationResult> validateAlphaCharacters() throws PasswordValidationException;
	
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public ArrayList<IPasswordValidationResult> validateSequenceOfCharacters () throws PasswordValidationException;

}
