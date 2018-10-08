/**
 * 
 */
package com.whitaker.models;

import java.util.regex.Pattern;

/**
 * @author Darnell Whitaker
 *
 */
public interface IPasswordPattern {
	
	public Pattern getPasswordPattern();
	
	public IPassword getPassword();
	
	public boolean matches();

}
