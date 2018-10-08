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
public interface ILengthValidationService extends IValidationService {
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public ArrayList<IPasswordValidationResult> validateLength() throws PasswordValidationException;

}
