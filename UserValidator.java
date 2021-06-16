package com.bridgelabz.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	/**
     	* @param NAME_PATTERN contain the correct pattern for First name and last name
	 */
	private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}$"; 
	
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

}