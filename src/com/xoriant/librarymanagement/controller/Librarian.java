package com.xoriant.librarymanagement.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.xoriant.librarymanagement.businessObjects.Address;
import com.xoriant.librarymanagement.businessObjects.Author;
import com.xoriant.librarymanagement.businessObjects.Book;
import com.xoriant.librarymanagement.businessObjects.Publisher;




public class Librarian implements ObjectCreator<Book>{

	
	
	@Override
	public Book getObject(Book object) {
		
		return object ;
	}


	@Override
	public Book createObject(HttpServletRequest req) throws ParseException {
		Address address = new Address();
		address.setAddressLine1(req.getParameter("authad1"));
		address.setAddressLine2(req.getParameter("authad2"));
		address.setCity(req.getParameter("authcity"));
		address.setCountry(req.getParameter("authcountry"));
		address.setStreetName(req.getParameter("authstreet"));
		System.out.println("Address till street");
		address.setZipCode(Long.valueOf(req.getParameter("authpin")));

		address.setState(req.getParameter("authstate"));
		Publisher publisher = new Publisher();
		publisher.setAddress(address);

		String dateStrdf =req.getParameter("pdateoff"); 

		System.out.println(dateStrdf);
		SimpleDateFormat curFormaterdf = new SimpleDateFormat("dd/mm/yyyy"); 
		Date dateObjdf = curFormaterdf.parse(dateStrdf); 
		Calendar caledf = Calendar.getInstance();
		caledf .setTime(dateObjdf);
		
		
		publisher.setDateOfFoundation(caledf);
		
		publisher.setContactNo1(Long.valueOf(req.getParameter("pphn1")));
		publisher.setContactNo2(Long.valueOf(req.getParameter("pphn2")));
		//publisher.setDateOfFoundation(concatDate());
		publisher.setEmail1(req.getParameter("pemail1"));
		publisher.setEmail2(req.getParameter("pemail2"));
		publisher.setName(req.getParameter("pname"));
		
		System.out.println("Address is set");

		Author author = new Author();
		author.setAdress(address);
		
		
		String authbd =req.getParameter("dateofbirth"); 

		System.out.println("author bd is "+authbd);
		SimpleDateFormat authbdate = new SimpleDateFormat("dd/mm/yyyy"); 
		Date authdbd = authbdate.parse(authbd); 
		Calendar authinstance = Calendar.getInstance();
		authinstance .setTime(authdbd);
		
		author.setBirthDate(authinstance);
		author.setContactNo1(Long.valueOf(req.getParameter("authpn1")));
		author.setContactNo2(Long.valueOf(req.getParameter("authpn2")));
		author.setEmail1(req.getParameter("authemail1"));
		author.setEmail2(req.getParameter("authemail2"));
		author.setGender(req.getParameter("gender"));
		System.out.println("Gender is "+req.getParameter("gender"));
		author.setFirstName(req.getParameter("authfname"));
		author.setMiddleName(req.getParameter("authmname"));
		author.setLastName(req.getParameter("authlname"));
		System.out.println("Author made");
		Book book = new Book();
		book.setPrice(Double.valueOf(req.getParameter("price")));
		book.setCategory(req.getParameter("bcat"));
		
		String dateStrdfoundation =req.getParameter("dopublication"); 

		

		System.out.println(dateStrdf);
		SimpleDateFormat curFormdp = new SimpleDateFormat("dd/mm/yyyy"); 
		Date datedp = curFormaterdf.parse(dateStrdf); 
		Calendar caledp = Calendar.getInstance();
		caledp .setTime(datedp);
		
		book.setDatOfPublication(caledp);
		
		String dateOfPublication =req.getParameter("pdob"); 

		System.out.println("date of publication is "+dateOfPublication);
		SimpleDateFormat dateofpub = new SimpleDateFormat("dd/mm/yyyy"); 
		Date dateObjdb = dateofpub.parse(dateOfPublication); 
		Calendar cdateofpub = Calendar.getInstance();
		cdateofpub .setTime(dateObjdb);
		book.setDatOfPublication(cdateofpub);
		
		book.setIsbnNumber(req.getParameter("bisbn"));
		book.setEdition(Integer.valueOf(req.getParameter("bedition")));
		book.setPublisher(publisher);
		book.setTitle(req.getParameter("btitle"));
		book.setAuthor(author);
		System.out.println("Book created");
		return book;
	}


	@Override
	public Book createObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
