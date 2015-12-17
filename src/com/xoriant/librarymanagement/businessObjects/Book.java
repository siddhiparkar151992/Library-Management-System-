package com.xoriant.librarymanagement.businessObjects;

import java.util.Calendar;

public class Book {
	private String IsbnNumber;
	private String title;
	private Author author;
	private Publisher publisher;
	private double price;
	private int edition;
	private Calendar datOfPublication;
	private String category;
	
	
	/**
	 * 
	 */
	public Book() {
		super();
	}

	/**
	 * @param isbnNumber
	 * @param title
	 * @param author
	 * @param publisher
	 * @param price
	 * @param edition
	 * @param datOfPublication
	 * @param category
	 */
	public Book(String isbnNumber, String title, Author author,
			Publisher publisher, double price, int edition,
			Calendar datOfPublication, String category) {
		super();
		IsbnNumber = isbnNumber;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.edition = edition;
		this.datOfPublication = datOfPublication;
		this.category = category;
	}

	/**
	 * @return the isbnNumber
	 */
	public String getIsbnNumber() {
		return IsbnNumber;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param isbnNumber
	 *            the isbnNumber to set
	 */
	public void setIsbnNumber(String isbnNumber) {
		IsbnNumber = isbnNumber;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * @return the publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the edition
	 */
	public int getEdition() {
		return edition;
	}

	/**
	 * @param edition
	 *            the edition to set
	 */
	public void setEdition(int edition) {
		this.edition = edition;
	}

	/**
	 * @return the datOfPublication
	 */
	public Calendar getDatOfPublication() {
		return datOfPublication;
	}

	/**
	 * @param datOfPublication
	 *            the datOfPublication to set
	 */
	public void setDatOfPublication(Calendar datOfPublication) {
		this.datOfPublication = datOfPublication;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((IsbnNumber == null) ? 0 : IsbnNumber.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime
				* result
				+ ((datOfPublication == null) ? 0 : datOfPublication.hashCode());
		result = prime * result + edition;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (IsbnNumber == null) {
			if (other.IsbnNumber != null)
				return false;
		} else if (!IsbnNumber.equals(other.IsbnNumber))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (datOfPublication == null) {
			if (other.datOfPublication != null)
				return false;
		} else if (!datOfPublication.equals(other.datOfPublication))
			return false;
		if (edition != other.edition)
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [IsbnNumber=" + IsbnNumber + ", title=" + title
				+ ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", edition=" + edition
				+ ", datOfPublication=" + datOfPublication + ", category="
				+ category + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

	
}
