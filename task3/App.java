package com.hibernate.com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration();
         cfg.configure("Emp-Config.xml");
         System.out.println("Configuration Object Created Successfully");
         SessionFactory sf=cfg.buildSessionFactory();
         System.out.println("Session Factory Object Created Successfully");
         Session s=sf.openSession();
         Transaction t=s.beginTransaction();
         Grouppp gro=new Grouppp();
         gro.setId(1);
         gro.setName("Seedot");
         gro.setEmployees(new HashMap<String, Employee>());
         
         Employee e1 = new Employee();
         e1.setEid(1);
         e1.setName("Echo");
         e1.setDepartment("SDE");
         
         Employee e2 = new Employee();
         e2.setEid(2);
         e2.setName("Jim");
         e2.setDepartment("EE");
         
         gro.getEmployees().put("100", e1);
         gro.getEmployees().put("101", e2);
         s.save(gro);
         t.commit();
         
         System.out.println("Successfully inserted into the Database");
         s.close();
         sf.close();
    }
}
