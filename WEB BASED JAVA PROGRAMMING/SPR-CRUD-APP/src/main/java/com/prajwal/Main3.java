package com.prajwal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.serv.CarService;

public class Main3 {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService m = (CarService) appCntx.getBean(CarService.class);

		m.remove(4);
		System.out.println("========= done");
	}

}
