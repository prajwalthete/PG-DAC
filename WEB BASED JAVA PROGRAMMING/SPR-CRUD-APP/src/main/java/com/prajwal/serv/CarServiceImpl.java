package com.prajwal.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajwal.dao.CarDao;
import com.prajwal.entity.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	@Override
	public void add(Car car) {
		carDao.save(car);
	}

	@Override
	public void modify(Car car) {
		carDao.update(car);
	}

	@Override
	public void remove(int id) {
		carDao.delete(id);
	}

	@Override
	public Car get(int id) {
		return carDao.select(id);
	}

	@Override
	public List<Car> getAll() {
		return carDao.selectAll();
	}

}
