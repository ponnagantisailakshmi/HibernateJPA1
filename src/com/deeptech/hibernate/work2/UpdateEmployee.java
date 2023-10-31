package com.deeptech.hibernate.work2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work2.dto.Employee;
import com.hibernate.work2.utility.HibernateUtil;
public class UpdateEmployee {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.con();
		Session ses=sf.openSession();
		ses.beginTransaction();
		Employee e= ses.get(Employee.class, 2);
		e.setEmpname("Shobha");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("update success");
	}

}
