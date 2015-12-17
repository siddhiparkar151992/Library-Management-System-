package com.xoriant.librarymanagement.model.dataaccessobjets;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.xoriant.librarymanagement.businessObjects.Address;
import com.xoriant.librarymanagement.businessObjects.User;
import com.xoriant.librarymanagement.controller.UserCredentialGenerator;
import com.xoriant.librarymanagement.model.ConnectionMaker;

public class UserDAOImplementation implements UserManagerDAO {

	static Connection connection = ConnectionMaker.getConnection();

	@Override
	public List<User> getAllUsers(HttpServletRequest req) throws SQLException,
			ParseException {

		String getAllUsers = "select * from users u as inner join contact_information as ci on u.user_id=ci.user_id inner join address as add on add.address_id=u.address_id";
		Statement statement = connection.createStatement();
		// statement.execute(getAllUsers);
		User user = new User();
		ResultSet rs = statement.executeQuery(getAllUsers);
		while (rs.next()) {
			user.setFirstName(rs.getString("first_name"));
			user.setMiddleName(rs.getString("middle_name"));

			user.setLastName(rs.getString("last_name"));

			Date dateStrdf = rs.getDate("tdate_of_birth");

			Calendar caledf = Calendar.getInstance();
			caledf.setTime(dateStrdf);
			System.out.println(dateStrdf);

			System.out.println("set birthdate to the object");
			user.setBirthDate(caledf);
			user.setGender(rs.getString("gender").toString());
			System.out.println("Gender is " + user.getGender());
			user.setEmail1(rs.getString("emailId1"));
			user.setEmail2(rs.getString("emailid2"));
			user.setContactNo1(rs.getLong(""));
			user.setContactNo2(rs.getLong("ph2"));
			Address address = new Address();
			address.setAddressLine1(req.getParameter("add1"));
			address.setAddressLine2(req.getParameter("add2"));
			address.setStreetName(req.getParameter("street"));
			address.setCity(req.getParameter("city"));
			address.setZipCode(Long.valueOf(req.getParameter("pin")));
			address.setState(req.getParameter("state"));
			address.setCountry(req.getParameter("country"));

			user.setAdress(address);
			String dateofmem = req.getParameter("memdate");

			System.out.println(dateofmem);
			SimpleDateFormat memdateformat = new SimpleDateFormat("dd/mm/yyyy");
			java.util.Date memdate = memdateformat.parse(dateofmem);
			Calendar calmem = Calendar.getInstance();
			calmem.setTime(memdate);

			// user.setAdress(address);
			user.setMembershipDate(calmem);

			String dateofexp = req.getParameter("memdate");

			System.out.println(dateofexp);
			SimpleDateFormat expdate = new SimpleDateFormat("dd/mm/yyyy");
			java.util.Date expdateutil = memdateformat.parse(dateofexp);
			Calendar expcal = Calendar.getInstance();
			expcal.setTime(memdate);

			user.setExpiryDate(expcal);

		}

		return null;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String user) throws SQLException {
		StringBuilder deleteuser = new StringBuilder();
		deleteuser.append("DELETE from User where first_name=" + user + "");
		try {
			PreparedStatement preStatement = connection
					.prepareStatement(deleteuser.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertIntoAddress(User user) throws SQLException {
		String addressId = "@1";
		Address address = user.getAdress();
		String addressEntry = "call address_entry(?,?,?,?,?,?,?,?);";
		PreparedStatement preStatement = connection
				.prepareStatement(addressEntry.toString());

		preStatement.setString(1, user.getAdress().getAddressLine1());
		preStatement.setString(2, user.getAdress().getAddressLine2());
		preStatement.setString(3, user.getAdress().getStreetName());
		preStatement.setString(4, user.getAdress().getCity());
		preStatement.setString(5, user.getAdress().getState());
		preStatement.setLong(6, user.getAdress().getZipCode());
		preStatement.setString(7, user.getAdress().getCountry());
		preStatement.setString(8, addressId);
		preStatement.executeUpdate();
	}

	@Override
	public void addUser(User user) throws SQLException {
		StringBuilder builUser = new StringBuilder();
		builUser.append("call user_entry(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
		PreparedStatement preStatement = connection.prepareStatement(builUser
				.toString());

		preStatement.setString(1, user.getFirstName());
		preStatement.setString(2, user.getMiddleName());
		preStatement.setString(3, user.getLastName());
		preStatement.setString(4, user.getGender());

		Calendar calendarDoba = Calendar.getInstance();
		// SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		System.out.println("User birth  date is "
				+ new Date(user.getBirthDate().getTime().getTime()));
		// calendarDob.set(year, month, date);
		calendarDoba.setTime(new Date(user.getBirthDate().getTime().getTime()));
		java.sql.Date sqlDatebdate = new java.sql.Date(calendarDoba.getTime()
				.getTime());
		String id;
		preStatement.setDate(5, sqlDatebdate);
		preStatement.setString(6, user.getAdress().getAddressLine1());
		preStatement.setString(7, user.getAdress().getAddressLine1());
		preStatement.setString(8, user.getAdress().getStreetName());
		preStatement.setString(9, user.getAdress().getCity());
		preStatement.setString(10, user.getAdress().getState());
		preStatement.setLong(11, user.getAdress().getZipCode());
		preStatement.setString(12, user.getAdress().getCountry());

		preStatement.setString(13, user.getAdress().getAddressLine1());
		preStatement.setString(14, user.getAdress().getAddressLine1());
		preStatement.setString(15, user.getAdress().getStreetName());
		preStatement.setString(16, user.getAdress().getCity());
		preStatement.setString(17, user.getAdress().getState());
		preStatement.setLong(18, user.getAdress().getZipCode());
		preStatement.setString(19, user.getAdress().getCountry());
		preStatement.setLong(20, user.getContactNo1());
		preStatement.setLong(21, user.getContactNo2());

		preStatement.setString(22, user.getEmail1());
		preStatement.setString(23, user.getEmail2());

		Calendar caldom = Calendar.getInstance();
		// SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		System.out.println("date of memebership is  "
				+ new Date(user.getMembershipDate().getTime().getTime()));
		// calendarDob.set(year, month, date);
		calendarDoba.setTime(new Date(user.getMembershipDate().getTime()
				.getTime()));
		java.sql.Date sqlcaldom = new java.sql.Date(caldom.getTime().getTime());
		preStatement.setDate(24, sqlcaldom);

		preStatement.setString(25, "normal_user");
		preStatement.executeUpdate();
		System.out.println("User addition is done");
	}

	@Override
	public void addUserCredentials(User user) throws SQLException {
		String username = UserCredentialGenerator.generateUserId(user);
		StringBuilder builsAuthenticationTable = new StringBuilder();
		String uname = UserCredentialGenerator.generateUserId(user);
		String password = UserCredentialGenerator.generatePassword(user);
		builsAuthenticationTable
				.append("INSERT INTO authentications VALUES(?,?,?,?,?)");
		PreparedStatement preStatement = connection
				.prepareStatement(builsAuthenticationTable.toString());
		preStatement.setString(1, getUserId(user));
		preStatement.setString(2, uname);
		preStatement.setString(3, password);
		preStatement.setString(4, user.getSecurityQuestion());
		preStatement.setString(5, user.getAnswer());
		preStatement.execute();
		System.out.println("Authentication table populated");

	}

	public String getUserId(User user) {
		String firstName = user.getFirstName();
		System.out.println("hjasdhsdhkj");
		String userIdQuery = "SELECT user_id from library.users where trim(first_name)='"
				+ firstName.trim() + "'";
		Statement statement = null;
		String userId = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(userIdQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String userid = null;
		System.out.println("uhhh");
		try {
			while (rs.next()) {
				userId = rs.getString(1);
				// System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userId;
	}

	public static List<List<String>> getRequest(String userId) {
		List<List<String>> booksRequestList = new ArrayList<>();
		ResultSet rs = null;
		Statement statement;
	//	System.out.println(searchBy + " " + searchLike);
		try {
			statement = connection.createStatement();			
			String serchQuery="select books.title,book_requests.check_in,book_requests.check_out,"
					+ "book_requests.status from"
					+ " books,book_requests where books.book_id=book_requests.book_id and book_requests.user_id='"+userId+"'";
			
			
			rs = statement.executeQuery(serchQuery);
			while (rs.next()) {
				List<String> list = new ArrayList<>();
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
				list.add(rs.getString(4));
				
				booksRequestList.add(list);

			}
		//	System.out.println(booksList);

		} catch (SQLException e) {
			// error
			System.out.println("retrieve error for requst records");
		//	e.printStackTrace();
		}

		return booksRequestList;

	}

}
