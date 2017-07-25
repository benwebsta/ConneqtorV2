package com.conneqtor.dao;

import com.conneqtor.beans.User;

public interface UserDao {

	public User getUserByEmail(String email);
	public boolean updateUser(User user);
}
