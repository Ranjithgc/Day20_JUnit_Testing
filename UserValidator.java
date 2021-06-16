package com.bridgelabz.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	/**
     	* @param NAME_PATTERN contain the correct pattern for First name and last name
	* @param EMAIL_PATTERN contain the email 
	*/
	private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}$"; 
	private final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[[.|+|-]a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2,3})*$";
	
	/** 
  	 * Uc1:
	 * @method validateFirstName Check the pattern for first name
     	 * @return boolean this returns true/false based on the firstname test result
     	 */
	public boolean validateFirstName(String firstName) {
        	Pattern pattern = Pattern.compile(NAME_PATTERN);
        	Matcher matcher = pattern.matcher(firstName);
        	boolean result = matcher.matches();
        	return result;
    	}

	/**
     	* Uc2: 
	* @method validateLastName Check the pattern for first name
     	* @return boolean this returns true/false based on the firstname test result
     	*/
    	public boolean validateLastName(String lastName) {
        	Pattern pattern = Pattern.compile(NAME_PATTERN);
        	Matcher matcher = pattern.matcher(lastName);
        	boolean result = matcher.matches();
        	return result;
    	}
	
	/**
	* Uc3:
     	* @method validateEmail Check the pattern for email
     	* @return boolean this returns true/false based on the email test result
     	*/

    	public boolean validateEmail(String email) {
        	Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        	Matcher matcher = pattern.matcher(email);
        	boolean result = matcher.matches();
        	return result;
    	}
}