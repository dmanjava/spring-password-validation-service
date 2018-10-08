package com.whitaker.service;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationException;

/**
 * @author Darnell Whitaker
 * 
 * - 2 Validation rules
 *   - password must contain at least one lowercase 
 *     
 *   - Must not contain any sequence of characters immediately
 *     followed by the same sequence.
 */

public class CharacterValidationService implements ICharacterValidationService {

	/**
	 * not enough lowercase character message
	 */
	public static final String NOT_ENOUGH_LOWERCASE = "Password must contain at least"
			+ " 1 lowercase character.";
	
	
	/**
	 * invalid character sequence messages
	 */
	public static final String INVALID_CHARACTER_SEQUENCE = "Password cannot contain a "
			+ " sequence of characters followed by the same sequence of characters.";
	
	/**
	 * the minimum number of lowercase characters
	 */
	public static final int MIN_LOWERCASE = 1;
	
	/**
	 * the minimum number of numbers
	 */
	public static final int MIN_NUMBERS = MIN_LOWERCASE;
	
	
	public CharacterValidationService() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.ICharacterValidationService#validateAlphaCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateAlphaCharacters(IPassword password) throws PasswordValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.ICharacterValidationService#validateSequenceOfCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateSequenceOfCharacters(IPassword password)
			throws PasswordValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
