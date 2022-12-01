package com.prajwal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.entity.Car;
import com.prajwal.serv.CarService;

public class Main4 {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService m = (CarService) appCntx.getBean(CarService.class);

		Car car = m.get(1);
		System.out.println(car);
		System.out.println("========= done");
	}

}
