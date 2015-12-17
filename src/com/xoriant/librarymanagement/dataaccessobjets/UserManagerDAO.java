package com.xoriant.librarymanagement.dataaccessobjets;

import java.util.List;

import com.xoriant.librarymanagement.businessObjects.User;


public interface UserManagerDAO {
	public List<User> getAllUsers();

	public User getUser(String userId);

	public void updateUser(User user);

	public void deleteUser(User user);

}
