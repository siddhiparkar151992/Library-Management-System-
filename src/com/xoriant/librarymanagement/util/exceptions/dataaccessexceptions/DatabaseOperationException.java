package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class DatabaseOperationException extends DatabaseException {
	
	private static final long serialVersionUID = 1L;
	public DatabaseOperationException() {
		super();
	}

	public DatabaseOperationException(String message) {
		super(message);
	}

	public DatabaseOperationException(Throwable cause) {
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
