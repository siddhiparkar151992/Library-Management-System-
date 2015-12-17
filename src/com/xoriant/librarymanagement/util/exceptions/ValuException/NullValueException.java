package com.xoriant.librarymanagement.util.exceptions.ValuException;

public class NullValueException extends ValueException {

	private static final long serialVersionUID = 1L;
	public NullValueException() {
		super();
	}

	public NullValueException(String message) {
		super(message);
	}

	public NullValueException(Throwable cause) {
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
