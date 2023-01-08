package com.cdac;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.dto.FlightDetails;
import com.cdac.service.FlightService;

@SpringBootTest
class FlightServiceTest {

	@Autowired
	private FlightService flightService;
	
	@Test
	void addFlight() {
		FlightDetails f = new FlightDetails();
		f.setStartDate(LocalDate.of(2023, 1, 15));
		f.setEndDate(LocalDate.of(2023, 2, 15));
		f.setFlightNo("AI-111");
		f.setSource("Delhi");
		f.setDestination("Mumbai");
		f.setDepartureTime(LocalTime.of(8,30));
		f.setArrivalTime(LocalTime.of(10, 30));
		f.setPrice(7500);
		
		flightService.addFlight(f);
		
		
	}

}
