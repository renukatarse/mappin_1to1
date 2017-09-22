package com.scp.college;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Main {
	public static void main(String[] args) {

		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("Hibernate One-To-One example (Annotation)");
		
		

		StudentDetail studentDetail = new StudentDetail("Sadashiv peth", "pune", "Maharastra", "India");
		
		Student student = new Student("Renu", "Sonvane", new Date(121212),"738-738-598");
		student.setStudentDetail(studentDetail);
		studentDetail.setStudent(student);
		
		
		session.save(student);

	/*	
		List<Student> students = session.createQuery("from Student").list();
		for (Student student1 : students) {
			System.out.println(student1.getFirstname() + " , "
					+ student1.getLastname() + ", "
					+ ((StudentDetail) student1.getStudentDetail()).getState());
		}
*/
		tx.commit();
		session.close();

	}
}



