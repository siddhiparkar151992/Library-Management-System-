package com.xoriant.librarymanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xoriant.librarymanagement.model.ConnectionMaker;
import com.xoriant.librarymanagement.model.dataaccessobjets.BookDAOImplementation;

public class LibrarianController extends HttpServlet {
	Administrator administrator = new Administrator();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("jsp/LibrarianProfile.jsp").include(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
		String book = req.getParameter("librarian");
		String showDue = req.getParameter("due");
		if (book.equals("Add Book Record")) {
			req.getRequestDispatcher("jsp/BookInformation.jsp").forward(req,
					resp);
		}

		else if (book.equals("Show requests")) {
			

			req.setAttribute("datalist", BookDAOImplementation.getdueRequests());

			RequestDispatcher dispatcher = req
					.getRequestDispatcher("jsp/DueRequests.jsp");
			dispatcher.forward(req, resp);
		}

	}
}
