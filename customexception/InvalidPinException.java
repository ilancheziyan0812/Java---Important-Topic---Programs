package com.customexception;

public class InvalidPinException extends RuntimeException {
	
	String message;
	
	InvalidPinException(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}

}
