/**
 * 
 */
package com.whitaker.service;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationError;

/**
 * @author macadmin
 *
 */
public class PasswordValidationService implements IPasswordValidationService, IPassword {
	
	private IPassword password;
	private ILengthValidationService lenghService;
	private ICharacterValidationService characterService;
	private INumericValidationService numericService;
	

	/**
	 * 
	 */
	public PasswordValidationService( final IPassword password,
			final ILengthValidationService lengthservice,
			final ICharacterValidationService characterservice,
			final INumericValidationService numericservice) {
		super();
		this.password = password;
		this.lenghService = lengthservice;
		this.characterService = characterservice;
		this.numericService = numericservice;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.models.IPassword#getPasswordText()
	 */
	@Override
	public String getPasswordText() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.models.IPassword#setPasswordText(java.lang.String)
	 */
	@Override
	public void setPasswordText(String password) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validate(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validate(IPassword password) throws PasswordValidationError {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateLength(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateLength(IPassword password) throws PasswordValidationError {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateAlphaCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateAlphaCharacters(IPassword password) throws PasswordValidationError {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateNumericCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateNumericCharacters(IPassword password) throws PasswordValidationError {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateSequenceOfCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateSequenceOfCharacters(IPassword password) throws PasswordValidationError {
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
