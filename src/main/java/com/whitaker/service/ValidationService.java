package com.whitaker.service;

import java.util.ArrayList;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.PasswordErrorType;
import com.whitaker.models.PasswordValidationException;
import com.whitaker.models.PasswordValidationResult;

public abstract class ValidationService implements IValidationService {
	
	/**
	 * the error message for null password
	 */
	static final String NULL_PASSWORD = "Null Password.";
	
	
	private IPassword password;
	private ArrayList<IPasswordValidationResult> validationResults;
	

	/**
	 * 
	 * @param password
	 * @throws PasswordValidationException
	 */
	public ValidationService( IPassword password) throws PasswordValidationException {
		super();
		this.setPassword(password);
		this.validationResults = new ArrayList<IPasswordValidationResult>();
	}
	
	/**
	 * @param IPassword for this validator
	 * @throws PasswordValidationException
	 */
	public void setPassword(IPassword password) throws PasswordValidationException {
		if(password == null) {
			PasswordValidationResult result = new PasswordValidationResult(
					this.getPassword(),
					NULL_PASSWORD,
					PasswordErrorType.NULL_PASSWORD_ERROR);
			throw new PasswordValidationException(PasswordErrorType.NULL_PASSWORD_ERROR, NULL_PASSWORD);
		}
		else {
			this.password = password;
		}
	}
	
	
	/**
	 * @return IPassword for this validator
	 */
	@Override
	public IPassword getPassword() {
		return this.password;
	}


	/**
	 * return list of validation results
	 */
	@Override
	public ArrayList<IPasswordValidationResult> getValidationResults() {
		return this.validationResults;
	}
	
	/**
	 * set the entire result array
	 */
	public void setValidationResults(ArrayList<IPasswordValidationResult> validationresults) {
		this.validationResults = validationresults;
	}
	
	/**
	 * return true if result is added
	 */
	public boolean addValidationResult(IPasswordValidationResult result) {
		return this.validationResults.add(result);
	}
	
	/**
	 * return true if result is removed
	 */
	public boolean removeValidationResult(IPasswordValidationResult result) {
		return this.validationResults.remove(result);
	}

}
