package com.flights.info.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flights.info.rest.entity.Routes;
import com.flights.info.rest.service.RoutesService;

@RestController
public class RoutesController {
	
	@Autowired
	 private RoutesService routesService;

	public RoutesService getRoutesService() {
		return routesService;
	}
	
	@GetMapping("/api/routes/airlines/{source_airport}/{dest_airport}")
	 public List<Routes> getRoutesBySourceAndDestAirport(@PathVariable(name="source_airport")String source_airport, @PathVariable(name="dest_airport")String dest_airport) {
	  return routesService.retrieveAirlineRoutesBySourceAndDestAirport(source_airport, dest_airport);
	 }

}
