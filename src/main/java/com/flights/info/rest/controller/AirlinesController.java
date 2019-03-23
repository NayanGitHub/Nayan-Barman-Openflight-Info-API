package com.flights.info.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flights.info.rest.entity.Airlines;
import com.flights.info.rest.service.AirlinesService;

@RestController
public class AirlinesController {
	
	@Autowired
	 private AirlinesService airlinesService;

	public AirlinesService getAirlinesService() {
		return airlinesService;
	}
	
	@GetMapping("/api/airlines/in/{dest_airport}")
	 public List<Airlines> getInFlightsByAirport(@PathVariable(name="dest_airport")String airport) {
	  return airlinesService.retrieveFlightsInByParticularAirport(airport);
	 }
	
	@GetMapping("/api/airlines/out/{source_airport}")
	 public List<Airlines> getOutFlightsByAirport(@PathVariable(name="source_airport")String airport) {
	  return airlinesService.retrieveFlightsInByParticularAirport(airport);
	 }

}
