package com.flights.info.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.info.rest.entity.Routes;
import com.flights.info.rest.repository.RoutesRepository;
import com.flights.info.rest.service.RoutesService;

@Service
public class RoutesServiceImpl implements RoutesService {

	@Autowired
	 private RoutesRepository routesRepository;
	
	public void setRoutesRepository(RoutesRepository routesRepository) { 
		this.routesRepository = routesRepository;
	}
	
	@Override
	public List<Routes> retrieveAirlineRoutesBySourceAndDestAirport(String source_airport, String dest_airport) {
		List<Routes> routes = routesRepository.findRoutesBySourceDestFlights(source_airport, dest_airport);
		return routes;
	}

}
