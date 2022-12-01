package com.prajwal.dao;

import java.util.List;

import com.prajwal.entity.Car;

public interface CarDao {
	void save(Car car);

	void update(Car car);

	void delete(int id);

	Car select(int id);

	List<Car> selectAll();
}
