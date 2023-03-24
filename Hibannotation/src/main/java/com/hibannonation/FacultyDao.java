package com.hibannonation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultyDao {
	
	public static SessionFactory sf()
	{
		Configuration conf=new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(Faculty.class);
        SessionFactory sfy=conf.buildSessionFactory();
        return sfy;
	}
	
	public static void InsertHibEmps(Faculty f)
	{
		Session openSession = FacultyDao.sf().openSession();
	    Transaction beginTransaction = openSession.beginTransaction();
	   // Annotation.class(Faculty);
		openSession.save(f);
		beginTransaction.commit();
		openSession.close();      
	}
	
	public static List<Faculty> RetrieveAll()
	{
		List<Faculty> getall=new ArrayList<Faculty>();
		Session openSession=FacultyDao .sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		getall=openSession.createQuery("from Faculty").getResultList();
		beginTransaction.commit();
		openSession.close();
		return getall;
	}
	
	public static Faculty GetSingleUsersById(int id)
	{
		Faculty f=new Faculty();
		Session openSession=FacultyDao.sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		Faculty f1=openSession.get(Faculty.class, id);
		beginTransaction.commit();
		openSession.close();
		return f1;
	}
	
	public static void DeleteById(int id)
	{
		Faculty f=new Faculty();
		Session openSession=FacultyDao .sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		f=openSession.get(Faculty.class, id);
		openSession.delete(f);
		beginTransaction.commit();
		openSession.close();
	}
	
	public static void UpdateUser(Faculty f)
	{
		Session openSession=FacultyDao.sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		openSession.update(f);
		beginTransaction.commit();
		openSession.close();
	}
	
}
