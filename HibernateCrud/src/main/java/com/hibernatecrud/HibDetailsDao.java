package com.hibernatecrud;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibDetailsDao {
	
	public static SessionFactory sf()
	{
		Configuration conf=new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory sfy=conf.buildSessionFactory();
        return sfy;
	}
	 
	public static void InsertHibEmps(HibEmployee hibemp)
	{
		Session openSession = HibDetailsDao.sf().openSession();
	    Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(hibemp);
		beginTransaction.commit();
		openSession.close();      
	}
	
	public static List<HibEmployee> RetrieveAllHibEmps()
	{
		List<HibEmployee> getall=new ArrayList<HibEmployee>();
		Session openSession=HibDetailsDao.sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		getall=openSession.createQuery("from HibEmployee").getResultList();
		beginTransaction.commit();
		openSession.close();
		return getall;
	}
	
	public static HibEmployee GetSingleUsersById(int id)
	{
		HibEmployee h=new HibEmployee();
		Session openSession=HibDetailsDao.sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		HibEmployee h1=openSession.get(HibEmployee.class, id);
		beginTransaction.commit();
		openSession.close();
		return h1;
	}
	
	public static void DeleteById(int id)
	{
		HibEmployee hibemp=new HibEmployee();
		Session openSession=HibDetailsDao.sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		hibemp=openSession.get(HibEmployee.class, id);
		openSession.delete(hibemp);
		beginTransaction.commit();
		openSession.close();
	}
	
	public static void UpdateUser(HibEmployee hibemp)
	{
		Session openSession=HibDetailsDao.sf().openSession();
		Transaction beginTransaction=openSession.beginTransaction();
		openSession.update(hibemp);
		beginTransaction.commit();
		openSession.close();
	}
}
