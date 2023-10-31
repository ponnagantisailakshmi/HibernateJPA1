package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.hibernate.work2.utility.HibernateUtil;



public class DeleteEmployee {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.con();
		Session e=sf.openSession();
		e.beginTransaction();
		
		Employee s=e.load(Employee.class, 1);
		e.delete(s);
		System.out.println("Record deleted sucessfully");
		e.getTransaction().commit();
		sf.close();
		e.close();

	}

}
