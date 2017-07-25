package com.conneqtor.service;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.User;
import com.conneqtor.dao.UserDao;
import com.conneqtor.dao.UserDaoImpl;

@Component
public class UserService {
	UserDao userDao = new UserDaoImpl();
	
	public boolean updateUser(User user){
		System.out.println("in service");
		System.out.println(user);
		return userDao.updateUser(user);
	}

}
