package com.xoriant.librarymanagement.model.dataaccessobjets;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.xoriant.librarymanagement.businessObjects.Book;
import com.xoriant.librarymanagement.model.ConnectionMaker;

public class BookDAOImplementation implements BookManagerDAO {
	static Connection connection = ConnectionMaker.getConnection();

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

	@Override
	public void addBook(Book book) throws SQLException, ParseException {

		StringBuilder buildBook = new StringBuilder();
		buildBook
				.append("call book_entry(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
		PreparedStatement preStatement = connection.prepareStatement(buildBook
				.toString());

		preStatement.setString(1, book.getIsbnNumber());
		preStatement.setString(2, book.getTitle());
		preStatement.setString(3, book.getAuthor().getFirstName());
		preStatement.setString(4, book.getAuthor().getMiddleName());
		preStatement.setString(5, book.getAuthor().getLastName());

		Calendar calendarDoba = Calendar.getInstance();
		// SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		System.out.println("Author birth  date is "
				+ new Date(book.getPublisher().getDateOfFoundation().getTime()
						.getTime()));
		// calendarDob.set(year, month, date);
		calendarDoba.setTime(new Date(book.getAuthor().getBirthDate().getTime()
				.getTime()));
		java.sql.Date sqlDate = new java.sql.Date(calendarDoba.getTime()
				.getTime());

		// Calendar calendarDOJ = Calendar.getInstance();
		// calendarDOJ.setTime(book.getAuthor().getBirthDate().getTime());
		// java.sql.Date sqlDate2 = new java.sql.Date(calendarDOJ.getTime()
		// .getTime());
		preStatement.setDate(6, sqlDate);
		preStatement.setString(7, book.getAuthor().getGender());
		preStatement.setString(8, book.getAuthor().getAdress()
				.getAddressLine1());
		preStatement.setString(9, book.getAuthor().getAdress()
				.getAddressLine2());
		preStatement
				.setString(10, book.getAuthor().getAdress().getStreetName());
		preStatement.setString(11, book.getAuthor().getAdress().getCity());
		preStatement.setString(12, book.getAuthor().getAdress().getState());
		preStatement.setLong(13, book.getAuthor().getAdress().getZipCode());
		preStatement.setString(14, book.getAuthor().getAdress()
				.getAddressLine1());
		preStatement.setString(15, book.getAuthor().getAdress()
				.getAddressLine2());
		preStatement
				.setString(16, book.getAuthor().getAdress().getStreetName());
		preStatement.setString(17, book.getAuthor().getAdress().getCity());
		preStatement.setString(18, book.getAuthor().getAdress().getState());
		preStatement.setLong(19, book.getAuthor().getAdress().getPincode());
		preStatement.setLong(20, book.getAuthor().getContactNo1());
		preStatement.setLong(21, book.getAuthor().getContactNo2());
		preStatement.setString(22, book.getAuthor().getEmail1());
		preStatement.setString(23, book.getAuthor().getEmail2());

		System.out.println("Author added");
		preStatement.setString(24, book.getPublisher().getName());
		preStatement.setString(25, book.getPublisher().getAddress()
				.getAddressLine1());
		preStatement.setString(26, book.getPublisher().getAddress()
				.getAddressLine2());
		preStatement.setString(27, book.getPublisher().getAddress()
				.getStreetName());
		preStatement.setString(28, book.getPublisher().getAddress().getCity());
		preStatement.setString(29, book.getPublisher().getAddress().getState());
		preStatement.setLong(30, book.getPublisher().getAddress().getPincode());
		preStatement.setLong(31, book.getPublisher().getContactNo1());
		preStatement.setLong(32, book.getPublisher().getContactNo2());
		preStatement.setString(33, book.getPublisher().getEmail1());
		preStatement.setString(34, book.getPublisher().getEmail2());
		System.out.println("Added publisher");

		/**
		 * parse the date and set birthdate on calender instance
		 */
		// calendar.setTime(sdf.parse(date));
		/*
		 * Calendar cal = Calendar.getInstance(); SimpleDateFormat sdf8 = new
		 * SimpleDateFormat("YYYY-mm-dd");
		 * cal.setTime(sdf8.parse("2014-12-12"));
		 * System.out.println("Hardcoded date is "+cal.getTime());
		 * 
		 * 
		 * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 * java.util.Date date = format.parse(book.getPublisher().); // mysql
		 * datetime format GregorianCalendar calendar = new GregorianCalendar();
		 * calendar.setTime(date); System.out.println(calendar.getTime());
		 * 
		 * //GregorianCalendar -> mysql datetime
		 * 
		 * SimpleDateFormat formatd = new SimpleDateFormat("yyyy-MM-dd"); String
		 * string = formatd.format(calendar.getTime());
		 * System.out.println(string);
		 */
		Calendar calendarDob = Calendar.getInstance();
		// SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		System.out.println("Publisher date is "
				+ new Date(book.getPublisher().getDateOfFoundation().getTime()
						.getTime()));
		// calendarDob.set(year, month, date);
		calendarDob.setTime(new Date(book.getPublisher().getDateOfFoundation()
				.getTime().getTime()));
		java.sql.Date sqlDate8 = new java.sql.Date(calendarDob.getTime()
				.getTime());
		preStatement.setDate(35, sqlDate8);
		preStatement.setDouble(36, book.getPrice());
		preStatement.setInt(37, book.getEdition());
		System.out.println("added book");
		Calendar calendarDop = Calendar.getInstance();
		calendarDop.setTime(book.getAuthor().getBirthDate().getTime());
		java.sql.Date sqlDatep = new java.sql.Date(calendarDob.getTime()
				.getTime());
		preStatement.setDate(38, sqlDatep);
		preStatement.setString(39, book.getCategory());
		preStatement.setInt(40, 45);
		preStatement.executeUpdate();
		// System.out.println("added author");
		// connection.commit();
		System.out.println("Table Insertion done");

	}

	public static List<List<String>> getdueRequests() {

		// Establish connection to MySQL database

		List<List<String>> list = new ArrayList<>();

		// Select the data from the database

		String sql = "select * from library.book_requests where status='RENEW';";


		try {
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(sql);
		
			while (rs.next()) {
				List<String> dataList=new ArrayList<>();
				dataList.add(rs.getString(1));
				dataList.add(rs.getString(2));
				dataList.add(rs.getString(3));
				dataList.add(rs.getString(4));
				
				dataList.add(rs.getString(5));
				dataList.add(rs.getString(6));
				list.add(dataList);
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return list;
	}
}
