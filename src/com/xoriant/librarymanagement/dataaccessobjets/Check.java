package com.xoriant.librarymanagement.dataaccessobjets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xoriant.librarymanagement.businessObjects.User;
import com.xoriant.librarymanagement.model.ConnectionMaker;
import com.xoriant.librarymanagement.model.dataaccessobjets.UserDAOImplementation;


public class Check {
	Connection connection=ConnectionMaker.getConnection();
	
	public  String getUserId(String  user) 
	{
		//String firstName=user.getFirstName();
		System.out.println("hjasdhsdhkj");
		String userIdQuery="SELECT user_id from library.users where trim(first_name)='"+firstName.trim()+"'";
		Statement statement = null;
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
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userid;
	}
	
	public static void main(String[] args) {
		
		Check check=new Check();
		
		check.getUserId("siddhi");
	}


}
