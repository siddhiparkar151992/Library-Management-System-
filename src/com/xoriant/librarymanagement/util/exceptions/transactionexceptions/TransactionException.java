package com.xoriant.librarymanagement.util.exceptions.transactionexceptions;

public class TransactionException extends Exception{

	private static final long serialVersionUID = 1L;
	public TransactionException() {
		super();
	}

	public TransactionException(String message) {
		super(message);
	}

	public TransactionException(Throwable cause) {
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
