package com.deeptech.hibernate.work2;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work2.dto.Employee;
import com.hibernate.work2.utility.HibernateUtil;
public class ReadEmployee {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.con();
		Session e=sf.openSession();
		e.beginTransaction(); //performs DML operation(insert,select,update,delete)
		
		//Collection framework
		Query q = e.createQuery("from Employee");
		List<Employee>st=q.list();
		for(Employee emp :st)
		{	System.out.println(emp.getEmail()+"\t"+emp.getEmpname()+"\t"+emp.getDesignation()+"\t"+emp.getSalary());
		}
        e.getTransaction().commit();

	}

}
