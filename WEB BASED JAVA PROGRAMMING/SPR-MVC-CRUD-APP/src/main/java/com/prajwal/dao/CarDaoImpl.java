package com.prajwal.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.prajwal.entity.Car;

@Repository
public class CarDaoImpl implements CarDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(Car car) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.save(car);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}

	public void update(Car car) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.update(car);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}

	public void delete(int id) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.delete(new Car(id));
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}

	public Car select(int id) {

		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Car car = (Car) session.get(Car.class, id);
			t.commit();
			session.flush();
			session.close();
			return car;
		});
	}

	public List<Car> selectAll() {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Query q = session.createQuery("from Car");
			List<Car> cars = q.list();
			t.commit();
			session.flush();
			session.close();
			return cars;
		});
	}

}
