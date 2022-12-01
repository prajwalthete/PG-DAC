package com.prajwal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.prajwal.entity.Student;

public class Retrieve {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		// select the record for given ID if not found null is return
		Student emp = (Student) s.get(Student.class, 102);
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getStd());
		t.commit();
		s.close();
		sf.close();
	}

}
