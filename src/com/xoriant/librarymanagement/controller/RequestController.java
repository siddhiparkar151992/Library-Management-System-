package com.xoriant.librarymanagement.controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xoriant.librarymanagement.model.ConnectionMaker;

public class RequestController extends HttpServlet {
	Connection connection=ConnectionMaker.getConnection();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//Writer writer=resp.getWriter();
		//writer.write("Welcome");
		
		req.getRequestDispatcher("jsp/DueRequests.jsp").include(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Writer writer=resp.getWriter();
		String buttonClick=req.getParameter("req");
		
		String userid=req.getParameter("user_id");
		System.out.println(userid);
		
	}

}
