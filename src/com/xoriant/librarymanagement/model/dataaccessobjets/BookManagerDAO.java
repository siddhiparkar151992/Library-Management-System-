package com.xoriant.librarymanagement.model.dataaccessobjets;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.xoriant.librarymanagement.businessObjects.Book;


public interface BookManagerDAO {

	public List<Book> getAllBooks() throws SQLException;

	public Book getBook(String IsbnNo) throws SQLException;

	public void updateBook(Book book) throws SQLException;

	public void deleteBook(Book book) throws SQLException;
	
	public void addBook(Book book) throws SQLException, ParseException;

}
