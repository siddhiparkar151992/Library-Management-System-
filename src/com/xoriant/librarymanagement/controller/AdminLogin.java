package com.xoriant.librarymanagement.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// resp.setContentType("text/html;");
		Writer writer = resp.getWriter();
		String user = req.getParameter("name");
		String pass = req.getParameter("pass");
		if (user.equals("admin") && pass.equals("admin")) {
			
			 Cookie cookie = new Cookie("user", user); cookie.setMaxAge(60 *
			 30); resp.addCookie(cookie); Writer writer2 = resp.getWriter();
			 HttpSession userSession = req.getSession();
			 req.setAttribute("session id", userSession.getId());
			 req.setAttribute("time", userSession.getCreationTime());
			 
			writer.write("Welcome Admin");
			req.getRequestDispatcher("jsp/AdminProfile.jsp").forward(req, resp);

		}

		else {
			
			req.getRequestDispatcher("jsp/HomePage.jsp").forward(req, resp);
		}
	}
}
