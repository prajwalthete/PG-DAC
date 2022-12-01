package com.prajwal;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.entity.Car;
import com.prajwal.serv.CarService;

public class Main5 {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService m = (CarService) appCntx.getBean(CarService.class);

		List<Car> lst = m.getAll();
		lst.forEach(ele -> System.out.println(ele));
		System.out.println("========= done");
	}

}
