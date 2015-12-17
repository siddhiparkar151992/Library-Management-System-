package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class DatabaseException extends DataAccessOperation{
	
	private static final long serialVersionUID = 1L;
	public DatabaseException() {
		super();
	}

	public DatabaseException(String message) {
		super(message);
	}

	public DatabaseException(Throwable cause) {
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
