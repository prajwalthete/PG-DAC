package com.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookingMicroServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroServiceApp.class, args);
	}

}
