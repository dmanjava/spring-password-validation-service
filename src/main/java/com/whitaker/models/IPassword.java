package com.whitaker.models;

import java.io.Serializable;


/**
 * @author Darnell Whitaker
 *
 */
public interface IPassword extends Serializable {
	
	public String getPasswordText();
	
	public void setPasswordText(String password);

}
