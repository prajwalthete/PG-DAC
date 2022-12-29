package com.prajwal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.dao.AccountDaoo;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		AccountDaoo dao = (AccountDaoo) appCntx.getBean(AccountDaoo.class);
		dao.create();
		System.out.println("======================");
		dao.deposite();
		System.out.println("======================");
		dao.withdraw();
		System.out.println("======================");
		dao.accDetail();
		System.out.println("======================");
		dao.block();
	}

}
