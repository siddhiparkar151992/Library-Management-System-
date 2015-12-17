package com.xoriant.librarymanagement.model;

import java.util.List;

import com.xoriant.librarymanagement.businessobjects.Book;
import com.xoriant.librarymanagement.dataaccessobjets.BookManagerDAO;

public class Librarian implements BookManagerDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBook(String IsbnNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub

	}

}
