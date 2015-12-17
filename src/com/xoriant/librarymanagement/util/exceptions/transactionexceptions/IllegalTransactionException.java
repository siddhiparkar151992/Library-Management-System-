package com.xoriant.librarymanagement.util.exceptions.transactionexceptions;

public class IllegalTransactionException extends TransactionException {
	
	private static final long serialVersionUID = 1L;
	public IllegalTransactionException() {
		super();
	}

	public IllegalTransactionException(String message) {
		super(message);
	}

	public IllegalTransactionException(Throwable cause) {
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
