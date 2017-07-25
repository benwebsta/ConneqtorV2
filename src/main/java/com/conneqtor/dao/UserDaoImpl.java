package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.DistinctRootEntityResultTransformer;

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
			 sess.saveOrUpdate(user);
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
		Criteria cr = sess.createCriteria(User.class);
		cr.setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE);
		List<User> aptList = cr.list();
		System.out.println("in user dao: \n" + aptList);
		sess.close();
		return aptList;
	}


}
