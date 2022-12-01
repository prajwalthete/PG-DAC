package com.prajwal.serv;

import java.util.List;

import com.prajwal.entity.Car;

public interface CarService {
	void add(Car car);

	void modify(Car car);

	void remove(int id);

	Car get(int id);

	List<Car> getAll();
}
