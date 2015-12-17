package com.xoriant.librarymanagement.businessObjects;

import java.util.Calendar;

/**
 * @author parkar_s
 * 
 */
public abstract class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	private String firstName;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", adress=" + adress
				+ ", birthDate=" + birthDate + ", gender=" + gender
				+ ", contactNo1=" + contactNo1 + ", contactNo2=" + contactNo2
				+ ", email1=" + email1 + ", email2=" + email2 + "]";
	}
	private String middleName;
	private String lastName;
	private Address adress;
	private Calendar birthDate;
	private String gender;
	private long contactNo1;
	private long contactNo2;
	private String email1;
	private String email2;

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
	public Person(String firstName, String middleName, String lastName,
			Address adress, Calendar birthDate, String gender, long contactNo1,
			long contactNo2, String email1, String email2) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.adress = adress;
		this.birthDate = birthDate;
		this.gender = gender;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.email1 = email1;
		this.email2 = email2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + (int) (contactNo1 ^ (contactNo1 >>> 32));
		result = prime * result + (int) (contactNo2 ^ (contactNo2 >>> 32));
		result = prime * result + ((email1 == null) ? 0 : email1.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (adress == null) {
			if (other.adress != null) {
				return false;
			}
		} else if (!adress.equals(other.adress)) {
			return false;
		}
		if (birthDate == null) {
			if (other.birthDate != null) {
				return false;
			}
		} else if (!birthDate.equals(other.birthDate)) {
			return false;
		}
		if (contactNo1 != other.contactNo1) {
			return false;
		}
		if (contactNo2 != other.contactNo2) {
			return false;
		}
		if (email1 == null) {
			if (other.email1 != null) {
				return false;
			}
		} else if (!email1.equals(other.email1)) {
			return false;
		}
		if (email2 == null) {
			if (other.email2 != null) {
				return false;
			}
		} else if (!email2.equals(other.email2)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (middleName == null) {
			if (other.middleName != null) {
				return false;
			}
		} else if (!middleName.equals(other.middleName)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the adress
	 */
	public Address getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(Address adress) {
		this.adress = adress;
	}

	/**
	 * @return the birthDate
	 */
	public Calendar getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the contactNo1
	 */
	public long getContactNo1() {
		return contactNo1;
	}

	/**
	 * @param contactNo1 the contactNo1 to set
	 */
	public void setContactNo1(long contactNo1) {
		this.contactNo1 = contactNo1;
	}

	/**
	 * @return the contactNo2
	 */
	public long getContactNo2() {
		return contactNo2;
	}

	/**
	 * @param contactNo2 the contactNo2 to set
	 */
	public void setContactNo2(long contactNo2) {
		this.contactNo2 = contactNo2;
	}

	/**
	 * @return the email1
	 */
	public String getEmail1() {
		return email1;
	}

	/**
	 * @param email1 the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	/**
	 * @return the email2
	 */
	public String getEmail2() {
		return email2;
	}

	/**
	 * @param email2 the email2 to set
	 */
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	/**
	 * 
	 * @param birthDate
	 * @return
	 */
	public int calculateAge() {
		Calendar currentDate = Calendar.getInstance();
		int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		if (currentDate.get(Calendar.DAY_OF_YEAR) < birthDate
				.get(Calendar.DAY_OF_YEAR))
			age--;
		return age;
	}
	
	
}
