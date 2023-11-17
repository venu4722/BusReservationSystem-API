package com.busapi.exceptions;

@SuppressWarnings("serial")
public class BusException extends Exception{

	public BusException(String message) {
		super(message);
	}
	
	public BusException() {
		
	}
}
