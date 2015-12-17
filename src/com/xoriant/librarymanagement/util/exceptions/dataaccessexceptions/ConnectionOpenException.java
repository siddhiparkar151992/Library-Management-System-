package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class ConnectionOpenException extends DBConnectionException{
	private static final long serialVersionUID = 1L;
	public ConnectionOpenException() {
		super();
	}

	public ConnectionOpenException(String message) {
		super(message);
	}

	public ConnectionOpenException(Throwable cause) {
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
