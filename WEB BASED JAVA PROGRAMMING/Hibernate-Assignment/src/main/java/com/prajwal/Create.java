package com.prajwal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.prajwal.entity.Student;

public class Create {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		// read cfg information from file
		cfg.configure();

		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		// providing configuration (cfg) information to builder class
		ssrb.applySettings(cfg.getProperties());
		// prepared all required hibernate objects in ServiceRegistry
		StandardServiceRegistry ssr = ssrb.build();
		// get SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		// get Session object
		Session s = sf.openSession();
		// start transaction
		Transaction t = s.beginTransaction();

		Student emp = new Student(103,"Prajwal",13);
		// insert bean object content
		s.save(emp);
		// commit transaction
		t.commit();
		// close session
		s.close();
		// close session factory
		sf.close();

	}

}
