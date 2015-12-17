package com.xoriant.librarymanagement.util.exceptions.webserviceexceptions;

import com.xoriant.librarymanagement.util.exceptions.webserviceexceptions.ServletsException;

public class RequestNotFoundException extends ServletsException{
	
	private static final long serialVersionUID = 1L;
	public RequestNotFoundException() {
		super();
	}

	public RequestNotFoundException(String message) {
		super(message);
	}

	public RequestNotFoundException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "Invalid data Exception";
	}
	
	public String getMessage()
	{
		return toString();
	}


}
