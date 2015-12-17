package com.xoriant.librarymanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdministratorController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// doGet(req, resp);
		String user = req.getParameter("profile");
		String showDue = req.getParameter("due");
		HttpSession session = req.getSession();
		if (user.equals("user")) {

			req.getRequestDispatcher("jsp/UserInformation.jsp").forward(req,
					resp);
		}

		else if (user.equals("logout")) {

			if (session != null) {
				session.invalidate();
				req.getRequestDispatcher("jsp/HomePage.jsp").include(req, resp);
			}

			// req.getRequestDispatcher("jsp/HomePage.jsp").forward(req, resp);
		}

	}

}
