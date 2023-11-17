package com.busapi.exceptions;

@SuppressWarnings("serial")
public class UserException extends Exception{
	
	public UserException() {
		
	}
	public UserException(String message) {
		super(message);
	}
}
