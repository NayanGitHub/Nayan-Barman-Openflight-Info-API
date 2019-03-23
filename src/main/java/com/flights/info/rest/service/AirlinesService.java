package com.flights.info.rest.service;

import java.util.List;
import com.flights.info.rest.entity.*;

public interface  AirlinesService {
	public List<Airlines> retrieveFlightsOutByParticularAirport(String airport);
	public List<Airlines> retrieveFlightsInByParticularAirport(String airport);

}
