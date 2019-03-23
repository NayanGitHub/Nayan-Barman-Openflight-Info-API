package com.flights.info.rest.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.info.rest.entity.Airlines;
import com.flights.info.rest.repository.AirlinesRepository;
import com.flights.info.rest.service.AirlinesService;

@Service
public class AirlinesServiceImpl implements AirlinesService {
	@Autowired
	 private AirlinesRepository airlinesRepository;

	public void setEmployeeRepository(AirlinesRepository airlinesRepository) { 
		this.airlinesRepository = airlinesRepository;
	}

	@Override
	public List<Airlines> retrieveFlightsOutByParticularAirport(String airport) {
		List<Airlines> airlines = airlinesRepository.findOutFlightByAirport(airport);
		System.out.println("Airline.size"+ airlines.size());
		Iterator<Airlines> airlinesIterator = airlines.iterator();
		while (airlinesIterator.hasNext()) {
			System.out.println(airlinesIterator.next());
		}
		  return airlines;
	}

	@Override
	public List<Airlines> retrieveFlightsInByParticularAirport(String airport) {
		List<Airlines> airlines = airlinesRepository.findInFlightByAirport(airport);
		System.out.println("Airline.size"+ airlines.size());
		Iterator<Airlines> airlinesIterator = airlines.iterator();
		while (airlinesIterator.hasNext()) {
			System.out.println(airlinesIterator.next());
		}
		  return airlines;
	}

}
