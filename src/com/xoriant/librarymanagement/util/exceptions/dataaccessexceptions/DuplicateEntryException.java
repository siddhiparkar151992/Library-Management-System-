package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class DuplicateEntryException extends DatabaseOperationException{
	private static final long serialVersionUID = 1L;
	public DuplicateEntryException() {
		super();
	}

	public DuplicateEntryException(String message) {
		super(message);
	}

	public DuplicateEntryException(Throwable cause) {
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
