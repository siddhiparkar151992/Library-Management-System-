package com.xoriant.librarymanagement.controller;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.xoriant.librarymanagement.businessObjects.Address;
import com.xoriant.librarymanagement.businessObjects.User;
import com.xoriant.librarymanagement.model.ConnectionMaker;

public class Administrator implements ObjectCreator<User> {
	Connection connection = ConnectionMaker.getConnection();

	@Override
	public User getObject(User object) {

		return null;
	}

	@Override
	public User createObject(HttpServletRequest req) throws ParseException {
		User user = new User();
		user.setFirstName(req.getParameter("fname").trim());
		user.setMiddleName(req.getParameter("mname"));
		user.setLastName(req.getParameter("lname"));

		String dateStrdf = req.getParameter("dateofbirth");

		System.out.println(dateStrdf);
		SimpleDateFormat curFormaterdf = new SimpleDateFormat("dd/mm/yyyy");
		Date dateObjdf = curFormaterdf.parse(dateStrdf);
		Calendar caledf = Calendar.getInstance();
		caledf.setTime(dateObjdf);
		System.out.println("set birthdate to the object");
		user.setBirthDate(caledf);
		user.setGender(req.getParameter("gender"));
		System.out.println("Gender is " + user.getGender());
		user.setEmail1(req.getParameter("email"));
		user.setEmail2(req.getParameter("email2"));
		user.setContactNo1(Long.valueOf(req.getParameter("ph1")));
		user.setContactNo2(Long.valueOf(req.getParameter("ph2")));
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
		Date memdate = memdateformat.parse(dateofmem);
		Calendar calmem = Calendar.getInstance();
		calmem.setTime(memdate);

		// user.setAdress(address);
		user.setMembershipDate(calmem);

		String dateofexp = req.getParameter("memdate");

		System.out.println(dateofexp);
		SimpleDateFormat expdate = new SimpleDateFormat("dd/mm/yyyy");
		Date expdateutil = memdateformat.parse(dateofexp);
		Calendar expcal = Calendar.getInstance();
		expcal.setTime(expdateutil);

		user.setExpiryDate(expcal);

		user.setSecurityQuestion(req.getParameter("question"));
		user.setAnswer(req.getParameter("answer"));
		return user;

	}
	@Override
	public User createObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
