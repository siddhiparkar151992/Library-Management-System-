package com.xoriant.librarymanagement.util.exceptions.ValuException;

public class ValueException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public ValueException() {
		super();
	}

	public ValueException(String message) {
		super(message);
	}

	public ValueException(Throwable cause) {
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
