package com.Alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
       Aalien obj = new Aalien();
       obj.setAid(100);
       obj.setAname("Ani");
       obj.setColor("green");
       
       
      
       Configuration con = new Configuration().configure().addAnnotatedClass(Aalien.class);
       
      
       SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(obj);
       
       tx.commit();
    }
}
	