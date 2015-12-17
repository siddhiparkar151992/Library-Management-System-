package com.xoriant.librarymanagement.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xoriant.librarymanagement.businessObjects.User;
import com.xoriant.librarymanagement.model.dataaccessobjets.UserDAOImplementation;

public class UserController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserDAOImplementation bdao=new UserDAOImplementation();
		if (req.getParameter("submit").equals("Submit")) {
			System.out.println("Inside submit Loop");

			Administrator administrator=new Administrator();
			User finaluser;
			try {
				finaluser = administrator.createObject(req);
				bdao.addUser(finaluser);
				String id=bdao.getUserId(finaluser);
				
				System.out.println("Got the username pass form database");
				
				//EmailGenerator emailGenerator=new EmailGenerator();
				bdao.addUserCredentials(finaluser);
				System.out.println("Username password addition done");
				Map<String,String> usernameAndPassword=UserCredentialGenerator.retrieveUsetCredentials(id);
				System.out.println("Map is "+usernameAndPassword);
				//emailGenerator.generateEmail(usernameAndPassword,finaluser);
				System.out.println("user id is "+id);
			System.out.println(finaluser);
				System.out.println("User Object created");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			System.out.println("Administarot got the object");
	}

}
}
