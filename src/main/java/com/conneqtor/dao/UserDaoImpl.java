package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.User;
import com.conneqtor.config.HibernateUtil;

public class UserDaoImpl implements UserDao{
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateUser(User user) {
		System.out.println("in dao");
		System.out.println(user);
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		 try {
		     tx = sess.beginTransaction();
		     System.out.println(" in tx");
		     System.out.println(user);
			 sess.save(user);
			 System.out.println("end of tx");
		     tx.commit();
		     return true;

		 }
		 catch (Exception e) {
				e.printStackTrace();
				return false;
		 }
		 finally {

		     sess.close();
		 }
	}

	public List<User> getAllUsers() {
		Session sess = HibernateUtil.getSession();
		System.out.println("in get dao");
		List<User> userList;
		userList = sess.createCriteria(User.class).list();
		System.out.println(userList);
		sess.close();
		return userList;
	}


}
