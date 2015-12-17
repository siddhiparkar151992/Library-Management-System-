package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class DBConnectionException extends DatabaseException{
	private static final long serialVersionUID = 1L;
	public DBConnectionException() {
		super();
	}

	public DBConnectionException(String message) {
		super(message);
	}

	public DBConnectionException(Throwable cause) {
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
