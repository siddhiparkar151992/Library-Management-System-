package com.xoriant.librarymanagement.util.exceptions.webserviceexceptions;

public class InvalidURLException extends ServletsException{
	private static final long serialVersionUID = 1L;
	public InvalidURLException() {
		super();
	}

	public InvalidURLException(String message) {
		super(message);
	}

	public InvalidURLException(Throwable cause) {
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
