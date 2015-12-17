package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class DataAccessOperation extends Exception{
	private static final long serialVersionUID = 1L;
	public DataAccessOperation() {
		super();
	}

	public DataAccessOperation(String message) {
		super(message);
	}

	public DataAccessOperation(Throwable cause) {
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
