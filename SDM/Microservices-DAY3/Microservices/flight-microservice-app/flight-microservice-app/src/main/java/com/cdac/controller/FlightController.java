package com.cdac.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Flight;
import com.cdac.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@GetMapping("/flights/{source}/{destination}/{date}")
	
	public List<Flight> getFlights(@PathVariable("source") String source,
								   @PathVariable("destination") String destination,
								   @PathVariable("date") String date) {
		
		return flightService.getAvailableFlights(source, destination, LocalDate.parse(date));
	}

	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return flightService.getAvailableFlights();
	}
	
	//TODO:
	//Write @PostMapping for adding Flight
}
