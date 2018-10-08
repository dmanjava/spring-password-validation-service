/**
 * 
 */
package com.whitaker.service;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordValidationException;

/**
 * @author macadmin
 *
 */
public class PasswordValidationService extends ValidationService implements IPasswordValidationService {
	
	private ILengthValidationService lenghService;
	private ICharacterValidationService characterService;
	private INumericValidationService numericService;
	

	/**
	 * 
	 */
	public PasswordValidationService( final IPassword password,
			final ILengthValidationService lengthservice,
			final ICharacterValidationService characterservice,
			final INumericValidationService numericservice) throws PasswordValidationException {
		super(password);
		this.lenghService = lengthservice;
		this.characterService = characterservice;
		this.numericService = numericservice;
	}


	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validate(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validate(IPassword password) throws PasswordValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateLength(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateLength(IPassword password) throws PasswordValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateAlphaCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateAlphaCharacters(IPassword password) throws PasswordValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateNumericCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateNumericCharacters(IPassword password) throws PasswordValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.whitaker.service.IPasswordValidationService#validateSequenceOfCharacters(com.whitaker.models.IPassword)
	 */
	@Override
	public IPasswordValidationResult validateSequenceOfCharacters(IPassword password) throws PasswordValidationException {
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
