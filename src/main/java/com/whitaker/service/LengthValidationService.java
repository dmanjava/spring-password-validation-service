package com.whitaker.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.whitaker.models.IPassword;
import com.whitaker.models.IPasswordValidationResult;
import com.whitaker.models.Password;
import com.whitaker.models.PasswordErrorType;
import com.whitaker.models.PasswordValidationException;
import com.whitaker.models.PasswordValidationResult;

/**
 * 
 * @author Darnell Whitaker
 *
 * - 2 Validation rules
 *   - password cannot be less than 5 character
 *   
 *   - password cannot be more 
 */

public class LengthValidationService extends ValidationService implements ILengthValidationService {

	/**
	 * to short message
	 */
	public static final String TO_SHORT = "Password must be at least 5 characters long.";

	/**
	 * to long message
	 */
	public static final String TO_LONG = "Password cannot be longer than 12 characters.";

	/**
	 * the minimum password length
	 */
	public static final int MIN_LENGTH = 5;

	/**
	 * the maximum password length
	 */
	public static final int MAX_LENGTH = 12;

	public LengthValidationService(IPassword password) throws PasswordValidationException {
		super(password);
	}

	@Override
	public ArrayList<IPasswordValidationResult> validateLength() throws PasswordValidationException {
		// check the min length
		if (this.getPassword().getPasswordText().length() < MIN_LENGTH) {
			PasswordValidationResult result = new PasswordValidationResult(this.getPassword(), TO_SHORT,
					PasswordErrorType.LENGTH_VALIDATION_ERROR);
			this.addValidationResult(result);
		}
		// check the max length
		if (this.getPassword().getPasswordText().length() >= MAX_LENGTH) {
			PasswordValidationResult result = new PasswordValidationResult(this.getPassword(), TO_LONG,
					PasswordErrorType.LENGTH_VALIDATION_ERROR);
			this.addValidationResult(result);
		}

		return this.getValidationResults();
	}

	public static void main(String[] args) {
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
				String pwordtext = null;
				ArrayList<IPasswordValidationResult> results;
				System.out.println("Enter a password to validate...");
				try {
					while( pwordtext == null ) {
						pwordtext = reader.readLine();
						System.out.println("Got Password: " + pwordtext);
						
						// let's do our length validation
						IPassword pword = new Password(pwordtext);
						try {
							// create our length service
							ILengthValidationService lservice = new LengthValidationService(pword);
							results = lservice.validateLength();
							for (int i = 0; i < results.size(); i++) {
								IPasswordValidationResult r = results.get(i);
								System.out.println("Got " + results.size() + " error(s) with message \n\t - " + r.getPasswordErrorMessage());
							}
							System.out.println("Finished... OK");
						} catch (PasswordValidationException e) {
							System.out.println(e.getMessage());
						} finally {
							System.exit(0);
						}
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

	}

}
