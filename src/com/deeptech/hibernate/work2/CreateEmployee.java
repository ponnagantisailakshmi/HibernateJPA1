package com.deeptech.hibernate.work2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work2.dto.Employee;
import com.hibernate.work2.utility.HibernateUtil;

public class CreateEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmail("P.Sailakshmi@123");
		e.setEmpname("SaiLakshmi");
		e.setDesignation("Developer");
		e.setSalary(35000);
		SessionFactory sf=HibernateUtil.con();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(e);
		ses.getTransaction().commit();
		System.out.println("Record inserted seccussfully");
		ses.close();
		sf.close();
		
	}

}
