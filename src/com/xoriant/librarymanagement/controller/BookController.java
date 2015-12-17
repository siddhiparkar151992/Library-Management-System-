package com.xoriant.librarymanagement.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.xoriant.librarymanagement.businessObjects.Book;
import com.xoriant.librarymanagement.model.dataaccessobjets.BookDAOImplementation;

public class BookController extends HttpServlet {
	Librarian librarian = new Librarian();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
		 /* Address address = new Address();
		  address.setAddressLine1(req.getParameter("authad1"));
		  address.setAddressLine2(req.getParameter("authad2"));
		  address.setCity(req.getParameter("authcity"));
		  address.setCountry(req.getParameter("authcountry"));
		  address.setStreetName(req.getParameter("authstreet"));
		  System.out.println("Address till street");
		  address.setZipCode(Long.valueOf(req.getParameter("authpin")));
		  
		  Publisher publisher = new Publisher(); publisher.setAddress(address);
		  
		 publisher.setContactNo1(Long.valueOf(req.getParameter("pphn1")));
		  publisher.setContactNo2(Long.valueOf(req.getParameter("pphn2")));
		  publisher.setDateOfFoundation(concatDate());
		  publisher.setEmail1(req.getParameter("pemail1"));
		  publisher.setEmail2(req.getParameter("pemail2"));
		  publisher.setName(req.getParameter("pname"));
		  
		  
		  System.out.println("Address is set");
		  
		  Author author = new Author(); author.setAdress(address);
		  author.setBirthDate(concatDate());
		  author.setContactNo1(Long.valueOf(req.getParameter("authpn1")));
		  author.setContactNo2(Long.valueOf(req.getParameter("authpn2")));
		  author.setEmail1(req.getParameter("authemail1"));
		  author.setEmail2(req.getParameter("authemail2"));
		  author.setGender(req.getParameter("authg"));
		  author.setFirstName(req.getParameter("authfname"));
		  author.setMiddleName(req.getParameter("authmname"));
		  author.setLastName(req.getParameter("authlname"));
		  System.out.println("Author made"); Book book = new Book();
		  book.setPrice(Double.valueOf(req.getParameter("price")));
		  book.setCategory(req.getParameter("bcat"));
		  book.setDatOfPublication(concatDate());
		 book.setIsbnNumber(req.getParameter("bisbn"));
		 book.setEdition(Integer.valueOf(req.getParameter("bedition")));
		book.setPublisher(publisher);
		  book.setTitle(req.getParameter("btitle")); book.setAuthor(author);*/
		BookDAOImplementation bdao=new BookDAOImplementation();
		if (req.getParameter("submit").equals("Submit")) {
			System.out.println("Inside submit Loop");

			Book finalBook;
			try {
				finalBook = librarian.createObject(req);
				//bdao.addBook(finalBook);
				System.out.println(finalBook);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			
			System.out.println("Librarian got the object");
			
			
		}
	}

}
