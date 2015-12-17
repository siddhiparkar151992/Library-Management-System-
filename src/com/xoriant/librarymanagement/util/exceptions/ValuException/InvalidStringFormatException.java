package com.xoriant.librarymanagement.util.exceptions.ValuException;

public class InvalidStringFormatException extends ValueException{
	
	private static final long serialVersionUID = 1L;
	public InvalidStringFormatException() {
		super();
	}

	public InvalidStringFormatException(String message) {
		super(message);
	}

	public InvalidStringFormatException(Throwable cause) {
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
