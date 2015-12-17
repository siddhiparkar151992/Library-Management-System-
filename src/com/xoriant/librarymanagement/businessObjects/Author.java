package com.xoriant.librarymanagement.businessObjects;

import java.util.Calendar;
/**
 * 
 * @author parkar_s
 *
 */
public class Author extends Person {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Author []";
	}

	public Author()
	{
		
	}

	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param adress
	 * @param birthDate
	 * @param gender
	 * @param contactNo1
	 * @param contactNo2
	 * @param email1
	 * @param email2
	 */
	public Author(String firstName, String middleName, String lastName,
			Address adress, Calendar birthDate, String gender, long contactNo1,
			long contactNo2, String email1, String email2) {
		super(firstName, middleName, lastName, adress, birthDate, gender, contactNo1,
				contactNo2, email1, email2);
		// TODO Auto-generated constructor stub
	}

	
	
}
