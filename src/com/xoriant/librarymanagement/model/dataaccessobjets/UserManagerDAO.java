package com.xoriant.librarymanagement.model.dataaccessobjets;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.xoriant.librarymanagement.businessObjects.User;



public interface UserManagerDAO {
	
	public void addUserCredentials(User user) throws SQLException;

	public void addUser(User user) throws SQLException;

	public User getUser(String userId);

	public void updateUser(User user);

	public void deleteUser(String user) throws SQLException;

	List<User> getAllUsers(HttpServletRequest req) throws SQLException, ParseException;

}
