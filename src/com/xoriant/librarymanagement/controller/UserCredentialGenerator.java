package com.xoriant.librarymanagement.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.xoriant.librarymanagement.businessObjects.User;
import com.xoriant.librarymanagement.model.ConnectionMaker;

public class UserCredentialGenerator {
	static Connection connection = ConnectionMaker.getConnection();
	public static  String generateUserId(User user)
	{
		String userfirstName=user.getFirstName();
		String firstThreeletters=userfirstName.substring(0,3);
		String lastThreeLetters=user.getLastName().substring(0,user.getLastName().length());
		System.out.println("First three letters are"+firstThreeletters);
		
		
		String threeStringDigits=String.valueOf(lastThreeLetters);
		StringBuilder username=new StringBuilder();
		username.append(firstThreeletters);
		username.append("_");
		username.append(threeStringDigits);
		return username.toString();
		
	}
	
	public static String generatePassword(User user)
	{
		String userfirstName=user.getFirstName();
		String firstThreeletters=userfirstName.substring(0,3);
		System.out.println("First three letters are"+firstThreeletters);
		int lastThreeDigits=(new Random().nextInt(100));
		
		String threeStringDigits=String.valueOf(lastThreeDigits);
		StringBuilder username=new StringBuilder();
		username.append(firstThreeletters);
		username.append("_");
		username.append(threeStringDigits);
		return username.toString();
	}
	
	
	public static Map<String,String> retrieveUsetCredentials(String id)
	{
		Map<String,String> datalist=new HashMap<String,String>();
		String query="SELECT user_id,password from library.authentications where trim(User_Id)='"
				+ id.trim() + "'";
		Statement statement = null;
		String username = null;
		String password = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Getting credentials");
		try {
			while (rs.next()) {
				username = rs.getString(1);
				password=rs.getString(2);
				datalist.put(username, password);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datalist;
		
	}

}
