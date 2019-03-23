package com.flights.info.rest.entity;

import javax.persistence.Id;

/*@Entity
@Table(name = "airports")*/
public class Airports {
	@Id
	private String airport_ID;
	private String name;
	private String city;
	private String country;
	private String iata;
	private String icao;
	private String latitude;
	private String longitude;
	private String altitude;
	private String timezone;
	private String dst;
	private String tz_database_time;
	private String zone_type;
	private String source;
	
	public Airports() {
		
	}
	
	public Airports(String airport_ID, String name, String city, String country, String iata, String icao,
			String latitude, String longitude, String altitude, String timezone, String dst, String tz_database_time,
			String zone_type, String source) {
		super();
		this.airport_ID = airport_ID;
		this.name = name;
		this.city = city;
		this.country = country;
		this.iata = iata;
		this.icao = icao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.timezone = timezone;
		this.dst = dst;
		this.tz_database_time = tz_database_time;
		this.zone_type = zone_type;
		this.source = source;
	}

	public String getAirport_ID() {
		return airport_ID;
	}

	public void setAirport_ID(String airport_ID) {
		this.airport_ID = airport_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public String getTz_database_time() {
		return tz_database_time;
	}

	public void setTz_database_time(String tz_database_time) {
		this.tz_database_time = tz_database_time;
	}

	public String getZone_type() {
		return zone_type;
	}

	public void setZone_type(String zone_type) {
		this.zone_type = zone_type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
