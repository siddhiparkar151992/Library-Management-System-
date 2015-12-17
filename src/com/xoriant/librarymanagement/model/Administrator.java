package com.xoriant.librarymanagement.model;

import java.sql.Connection;
import java.util.List;

import com.xoriant.librarymanagement.businessobjects.User;
import com.xoriant.librarymanagement.dataaccessobjets.UserManagerDAO;

public class Administrator implements UserManagerDAO {
	Connection connection = DatabaseConnection.getConnection();

	@Override
	public List<User> getAllUsers() {

		return null;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		String query = "update book_requests ";

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
