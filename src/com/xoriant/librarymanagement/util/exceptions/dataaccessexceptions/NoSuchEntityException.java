package com.xoriant.librarymanagement.util.exceptions.dataaccessexceptions;

public class NoSuchEntityException extends DatabaseOperationException{
	
	private static final long serialVersionUID = 1L;

	public NoSuchEntityException() {
		super();
	}

	public NoSuchEntityException(String message) {
		super(message);
	}

	public NoSuchEntityException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "Invalid data Exception";
	}

	public String getMessage() {
		return toString();
	}



}
