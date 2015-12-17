package com.xoriant.librarymanagement.businessObjects;

import java.util.Calendar;

/**
 * 
 * @author parkar_s
 * 
 */
public class User extends Person {
	
	
	
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Calendar expiryDate;
	private Calendar membershipDate;
	private String securityQuestion;
	private String answer;
	
	
	
	/**
	 * @return the securityQuestion
	 */
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	/**
	 * @param securityQuestion the securityQuestion to set
	 */
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * @return the expiryDate
	 */
	public Calendar getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Calendar expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the membershipDate
	 */
	public Calendar getMembershipDate() {
		return membershipDate;
	}
	/**
	 * @param membershipDate the membershipDate to set
	 */
	public void setMembershipDate(Calendar membershipDate) {
		this.membershipDate = membershipDate;
	}
	/**
	 * @param expiryDate
	 * @param membershipDate
	 */
	public User(Calendar expiryDate, Calendar membershipDate) {
		super();
		this.expiryDate = expiryDate;
		this.membershipDate = membershipDate;
	}
	
	

}
