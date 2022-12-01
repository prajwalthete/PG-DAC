package com.prajwal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.entity.Car;
import com.prajwal.serv.CarService;

public class Main2 {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService m = (CarService) appCntx.getBean(CarService.class);

		Car car = new Car(2, "abc", "cde", 901.5f, "2021-12-10");
		m.modify(car);
		System.out.println("========= done");
	}

}
