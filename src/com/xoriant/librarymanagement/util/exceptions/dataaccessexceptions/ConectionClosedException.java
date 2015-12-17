package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class ConectionClosedException extends DBConnectionException{
	private static final long serialVersionUID = 1L;
	public ConectionClosedException() {
		super();
	}

	public ConectionClosedException(String message) {
		super(message);
	}

	public ConectionClosedException(Throwable cause) {
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
