package com.flights.info.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
/*@Table(name = "airlines")*/
public class Airlines {
	@Id
	//@Column(name="Airline_ID")
	private String airline_ID;
	//@Column(name="Name")
	private String name;
	//@Column(name="Alias")
	private String alias;
	//@Column(name="IATA")
	private String iata;
	//@Column(name="ICAO")
	private String icao;
	//@Column(name="Callsign")
	private String callsign;
	//@Column(name="Country")
	private String country;
	//@Column(name="Active")
	private String active;
	
	public Airlines() {
		
	}

	public Airlines(String airline_ID, String name, String alias, String iata, String icao, String callsign,
			String country, String active) {
		super();
		this.airline_ID = airline_ID;
		this.name = name;
		this.alias = alias;
		this.iata = iata;
		this.icao = icao;
		this.callsign = callsign;
		this.country = country;
		this.active = active;
	}
	
	public String getAirline_ID() {
		return airline_ID;
	}
	public void setAirline_ID(String airline_ID) {
		this.airline_ID = airline_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public String getCallsign() {
		return callsign;
	}
	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

}
