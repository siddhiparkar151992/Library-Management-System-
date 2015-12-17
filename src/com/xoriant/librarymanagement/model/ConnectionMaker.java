package com.xoriant.librarymanagement.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionMaker {

	private static Connection connection;

	private ConnectionMaker() {

	}

	private static Connection makeConnection() {
		Connection connection=null;
		System.out.println("----Making the connection----");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/library", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Mysql JDBC Driver class not found");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connection failed");
			e.printStackTrace();
		}

		if (connection == null) {
			System.out.println("connection not made");
		} else {
			System.out.println("connection made successfully");
		}
		return connection;
	}

	public static Connection getConnection() {
		if(connection==null){
			connection=makeConnection();
		}
		return connection;
	}
}
	
