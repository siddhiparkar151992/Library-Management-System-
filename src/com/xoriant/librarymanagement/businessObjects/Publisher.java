package com.xoriant.librarymanagement.businessObjects;

import java.util.Calendar;

/**
 * 
 * @author pramanick_s
 *
 */
public class Publisher {
	private String name;
	private long contactNo1;
	private long contactNo2;
	private String email1;
	private String email2;
	private Address address;
	private Calendar dateOfFoundation;
	/**
	 * 
	 */
	public Publisher() {
		super();
	}
	/**
	 * @param name
	 * @param contactNo1
	 * @param contactNo2
	 * @param email1
	 * @param email2
	 * @param address
	 * @param dateOfFoundation
	 */
	public Publisher(String name, long contactNo1, long contactNo2,
			String email1, String email2, Address address,
			Calendar dateOfFoundation) {
		super();
		this.name = name;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.email1 = email1;
		this.email2 = email2;
		this.address = address;
		this.dateOfFoundation = dateOfFoundation;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the dateOfFoundation
	 */
	public Calendar getDateOfFoundation() {
		return dateOfFoundation;
	}
	/**
	 * @param dateOfFoundation the dateOfFoundation to set
	 */
	public void setDateOfFoundation(Calendar dateOfFoundation) {
		this.dateOfFoundation = dateOfFoundation;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (contactNo1 ^ (contactNo1 >>> 32));
		result = prime * result + (int) (contactNo2 ^ (contactNo2 >>> 32));
		result = prime
				* result
				+ ((dateOfFoundation == null) ? 0 : dateOfFoundation.hashCode());
		result = prime * result + ((email1 == null) ? 0 : email1.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNo1 != other.contactNo1)
			return false;
		if (contactNo2 != other.contactNo2)
			return false;
		if (dateOfFoundation == null) {
			if (other.dateOfFoundation != null)
				return false;
		} else if (!dateOfFoundation.equals(other.dateOfFoundation))
			return false;
		if (email1 == null) {
			if (other.email1 != null)
				return false;
		} else if (!email1.equals(other.email1))
			return false;
		if (email2 == null) {
			if (other.email2 != null)
				return false;
		} else if (!email2.equals(other.email2))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", contactNo1=" + contactNo1
				+ ", contactNo2=" + contactNo2 + ", email1=" + email1
				+ ", email2=" + email2 + ", address=" + address
				+ ", dateOfFoundation=" + dateOfFoundation + "]";
	}
	

	
	
}
