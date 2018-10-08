package com.whitaker.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordPattern;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.Password;
import com.whitaker.models.PasswordErrorType;
import com.whitaker.models.PasswordPattern;
import com.whitaker.models.PasswordValidationException;
import com.whitaker.models.PasswordValidationResult;

/**
 * @author Darnell Whitaker
 * 
 *         - 2 Validation rules - password must contain at least one lowercase
 * 
 *         - Must not contain any sequence of characters immediately followed by
 *         the same sequence.
 */

public class CharacterValidationService extends ValidationService implements ICharacterValidationService {

	/**
	 * not enough lowercase character message
	 */
	public static final String NOT_ENOUGH_LOWERCASE = "Password must contain at least" + " 1 lowercase and"
			+ " 1 numeric character.";

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
	 * This is our password regex pattern
	 */
	private IPasswordPattern passwordPattern;
	
	/**
	 * 
	 * @param password
	 * @throws PasswordValidationException
	 */
	public CharacterValidationService(IPassword password,
			IPasswordPattern passwordpattern) throws PasswordValidationException {
		super(password);
		if(passwordpattern == null) {
			throw new PasswordValidationException(PasswordErrorType.NULL_PATTERN_ERROR,
					PasswordPattern.NULL_PATTERN);
		}
		this.passwordPattern = passwordpattern;
	}

	@Override
	/**
	 * 
	 */
	public ArrayList<IPasswordValidationResult> validateCharacters() throws PasswordValidationException {
		// check that there is at least on lower case character
		if (!this.passwordPattern.matches()) {
			PasswordValidationResult result = new PasswordValidationResult(this.getPassword(), NOT_ENOUGH_LOWERCASE,
					PasswordErrorType.CHARACTER_VALIDATION_ERROR);
			this.addValidationResult(result);
			
		}
		return this.getValidationResults();
	}

	@Override
	public ArrayList<IPasswordValidationResult> validateSequenceOfCharacters()
			throws PasswordValidationException {
		
		return this.getValidationResults();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String pwordtext = null;
		ArrayList<IPasswordValidationResult> results;
		System.out.println("Enter a password to validate...");
		try {
			while (pwordtext == null) {
				pwordtext = reader.readLine();
				System.out.println("Got Password: " + pwordtext);

				// let's do our length validation
				IPassword pword = new Password(pwordtext);
				try {
					// create our password pattern
					IPasswordPattern pattern = new PasswordPattern(pword, PasswordPattern.FULL_REGEX_PATTERN);
					// create our character servers and do validation
					ICharacterValidationService cservice = new CharacterValidationService(pword, pattern);
					results = cservice.validateCharacters();
					for (int i = 0; i < results.size(); i++) {
						IPasswordValidationResult r = results.get(i);
						System.out.println("Got " + results.size() + " error(s) with message \n\t - "
								+ r.getPasswordErrorMessage());
					}
					System.out.println("Finished... OK");
				} catch (PasswordValidationException e) {
					System.out.println(e.getMessage());
				} finally {
					System.exit(0);
				}
			}

		} catch (IOException e) {
			System.out.println("IOException Occurred.");
			e.printStackTrace();
		}

	}

}
