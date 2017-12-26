package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.UserDao;
import com.Model.User;



public class UserDaoImpl implements UserDao
{
	
	SessionFactory sessionFactory;
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory)
	{
	 super();
	 this.sessionFactory= sessionFactory;
	}
	public void insertUser(User user)
	{
	 Session session = sessionFactory.openSession();
	 session.beginTransaction();
	 session.saveOrUpdate(user);
	 session.getTransaction().commit();
	}
}