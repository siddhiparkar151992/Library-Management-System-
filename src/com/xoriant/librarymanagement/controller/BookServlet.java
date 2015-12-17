package com.xoriant.librarymanagement.controller;

import java.io.IOException;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xoriant.librarymanagement.model.Administrator;
import com.xoriant.librarymanagement.model.DatabaseConnection;

public class BookServlet extends HttpServlet{
	Administrator administrator=new Administrator();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			Statement statement=connection.createStatement();
			String btn=req.getParameter("update");
			if(btn.equals("update"))
			{
				administrator.updateUser(user);
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
