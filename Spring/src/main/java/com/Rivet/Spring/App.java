package com.Rivet.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap =new ClassPathXmlApplicationContext("/com/onerivet/configuration/Configbean.xml");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("The Setter Type of Dependency Injection: ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        Faculty bean = ap.getBean("guide", Faculty.class);
       
        System.out.println("Id= "+bean.getId()+"\n"+ "Name= "+bean.getName()+"\n" +"EmailId= "+bean.getEmailId()+"\n"+"Password= "+ bean.getPassword());
        System.out.println(bean.getSubject());
        System.out.println(bean.getExperience());
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("The Constructors Arg of Dependency Injection: ");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        Faculty bean1 = ap.getBean("g1", Faculty.class);
        System.out.println("Id=" + bean1.getId()+"\n"+"Name= " + bean1.getName()+"\n" + "EmailId= " +  bean1.getEmailId()+ "\n" + "Password= " + bean1.getPassword());
        System.out.println(bean1.getSubject()+" "+ bean1.getExperience());
    }
}
