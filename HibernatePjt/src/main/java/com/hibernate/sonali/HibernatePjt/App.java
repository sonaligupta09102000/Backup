package com.hibernate.sonali.HibernatePjt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration conf=new Configuration();
        conf.configure("hibernate.cfg.xml");
        
        SessionFactory sfy=conf.buildSessionFactory();
        
        Employee emp=new Employee();
        emp.setId(2);
        emp.setName("selin");
        emp.setAge("26");
        
        Session s1=sfy.openSession();
        Transaction trans=s1.beginTransaction();
        
        s1.save(emp);
        trans.commit();
        s1.close();
    }
}
