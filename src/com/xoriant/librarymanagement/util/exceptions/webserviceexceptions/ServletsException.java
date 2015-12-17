package com.xoriant.librarymanagement.util.exceptions.webserviceexceptions;

import javax.servlet.ServletException;

public class ServletsException extends ServletException{
	
	private static final long serialVersionUID = 1L;
	public ServletsException() {
		super();
	}

	public ServletsException(String message) {
		super(message);
	}

	public ServletsException(Throwable cause) {
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
