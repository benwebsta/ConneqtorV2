package com.conneqtor.dao;

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
		    
			 sess.saveOrUpdate(user);
			 
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


}
