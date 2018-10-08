/**
 * 
 */
package com.whitaker.models;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * @author macadmin
 *
 */
public class PasswordPattern implements IPasswordPattern {
	
	/**
	 * the error message for null pattern
	 */
	public static final String NULL_PATTERN = "Null Pattern.";
	
	/**
	 * regex pattern must contain at least one lower case character
	 */
	public static final String LOWERCASE_REGEX_PATTERN = "(.*[a-z].*)";
	
	/**
	 * regex pattern must contain at least one NUMBER
	 */
	public static final String NUMBER_REGEX_PATTERN = "(.*\\d.*)";
	
	/**
	 * the full pattern for one lowercase and one number
	 */
	public static final String FULL_REGEX_PATTERN = "("+LOWERCASE_REGEX_PATTERN 
			+ ")(" + NUMBER_REGEX_PATTERN +")";
	
	private IPassword password;
	private Pattern thePattern;
	private Matcher matcher;

	public PasswordPattern( IPassword password, String pattern) throws PasswordValidationException{
		super();
		this.password = password;
		this.setPatternText(pattern);
	}

	/**
	 * return the regex pattern
	 */
	@Override
	public Pattern getPasswordPattern() {
		return this.thePattern;
	}
	
	/**
	 * 
	 * @param pattern
	 * @throws PasswordValidationException
	 */
	private void setPatternText(String pattern) throws PasswordValidationException {
		if(pattern == null) {
			throw new PasswordValidationException(PasswordErrorType.NULL_PATTERN_ERROR, NULL_PATTERN);
		}
		else {
			this.thePattern = Pattern.compile(pattern);
		}
	}

	/**
	 * return the password to match the pattern against
	 */
	@Override
	public IPassword getPassword() {
		return this.password;
	}

	/**
	 * @return true if password passes the pattern
	 */
	public boolean matches() {
		this.matcher = this.thePattern.matcher(this.password.getPasswordText());
		return this.matcher.matches();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String patterntext = FULL_REGEX_PATTERN;
		String passwordtext = "2SDFFr";
		try {
			PasswordPattern pattern = new PasswordPattern(new Password(passwordtext), patterntext);
			if(!pattern.matches()) {
				System.out.println("does not match.");
			} else {
				System.out.println("Pattern ok!");
			}
		} catch (PasswordValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
