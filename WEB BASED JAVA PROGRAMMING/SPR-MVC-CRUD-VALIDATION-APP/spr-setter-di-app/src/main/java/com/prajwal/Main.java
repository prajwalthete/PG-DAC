package com.prajwal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.comp.MyBean;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		MyBean ref = (MyBean) appCntx.getBean("mb");
		System.out.println(ref.getMsg());
		System.out.println(ref.getMsgId());

		MyBean ref1 = (MyBean) appCntx.getBean("mb1");
		System.out.println(ref1.getMsg());
		System.out.println(ref1.getMsgId());
	}

}
