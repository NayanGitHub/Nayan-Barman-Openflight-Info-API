package com.flights.info.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Routes {
	@Id
	private String airline;
	private String airline_ID;
	private String source_airport;
	private String source_airport_ID;
	private String destination_airport;
	private String destination_airport_ID;
	private String codeshare;
	private String stops;
	private String equipment;
	
	public Routes() {
		
	}
	public Routes(String airline, String airline_ID, String source_airport, String source_airport_ID,
			String destination_airport, String destination_airport_ID, String codeshare, String stops,
			String equipment) {
		super();
		this.airline = airline;
		this.airline_ID = airline_ID;
		this.source_airport = source_airport;
		this.source_airport_ID = source_airport_ID;
		this.destination_airport = destination_airport;
		this.destination_airport_ID = destination_airport_ID;
		this.codeshare = codeshare;
		this.stops = stops;
		this.equipment = equipment;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getAirline_ID() {
		return airline_ID;
	}
	public void setAirline_ID(String airline_ID) {
		this.airline_ID = airline_ID;
	}
	public String getSource_airport() {
		return source_airport;
	}
	public void setSource_airport(String source_airport) {
		this.source_airport = source_airport;
	}
	public String getSource_airport_ID() {
		return source_airport_ID;
	}
	public void setSource_airport_ID(String source_airport_ID) {
		this.source_airport_ID = source_airport_ID;
	}
	public String getDestination_airport() {
		return destination_airport;
	}
	public void setDestination_airport(String destination_airport) {
		this.destination_airport = destination_airport;
	}
	public String getDestination_airport_ID() {
		return destination_airport_ID;
	}
	public void setDestination_airport_ID(String destination_airport_ID) {
		this.destination_airport_ID = destination_airport_ID;
	}
	public String getCodeshare() {
		return codeshare;
	}
	public void setCodeshare(String codeshare) {
		this.codeshare = codeshare;
	}
	public String getStops() {
		return stops;
	}
	public void setStops(String stops) {
		this.stops = stops;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	
}
