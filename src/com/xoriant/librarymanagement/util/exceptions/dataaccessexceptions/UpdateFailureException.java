package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class UpdateFailureException extends DatabaseOperationException{
	
	private static final long serialVersionUID = 1L;
	public UpdateFailureException() {
		super();
	}

	public UpdateFailureException(String message) {
		super(message);
	}

	public UpdateFailureException(Throwable cause) {
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
