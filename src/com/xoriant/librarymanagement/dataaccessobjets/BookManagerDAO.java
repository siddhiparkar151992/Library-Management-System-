package com.xoriant.librarymanagement.dataaccessobjets;

import java.util.List;

import com.xoriant.librarymanagement.businessobjects.Book;

public interface BookManagerDAO {

	public List<Book> getAllBooks();

	public Book getBook(String IsbnNo);

	public void updateBook(Book book);

	public void deleteBook(Book book);

}
