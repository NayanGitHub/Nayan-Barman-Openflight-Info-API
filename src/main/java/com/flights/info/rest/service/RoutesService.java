package com.flights.info.rest.service;

import java.util.List;

import com.flights.info.rest.entity.Routes;

public interface RoutesService {
	public List<Routes> retrieveAirlineRoutesBySourceAndDestAirport(String source_airport, String dest_airport);
}
