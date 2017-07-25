package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.User;

public interface UserDao {

	public User getUserByEmail(String email);
	public boolean updateUser(User user);
	public List<User> getAllUsers();
}
