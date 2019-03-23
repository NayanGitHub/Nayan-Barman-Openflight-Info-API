package com.flights.info.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackages ="com.flights.info.rest")
@SpringBootApplication
public class SpringBootOpenflightInfoApiH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenflightInfoApiH2Application.class, args);
		loadAirlinesData();
		loadAirportsData();
		loadRoutesData();
	}
	
	//loading Airlines Data
	 static void loadAirlinesData(){
		 
		 	Connection conn = null;
			Statement stmt = null;

			try {
				Class.forName("org.h2.Driver");
				conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
				stmt = conn.createStatement();

				stmt.execute("drop table if exists airlines");
				stmt.execute(
						"create table airlines (Airline_ID varchar(100) primary key, Name varchar(100), Alias varchar(100), IATA varchar(100), ICAO varchar(100), Callsign varchar(100), Country varchar(100), Active varchar(100))");
				stmt.execute(
						"insert into airlines (Airline_ID, Name, Alias, IATA, ICAO, Callsign, Country, Active)     select \"Airline_ID\", \"Name\", \"Alias\", \"IATA\", \"ICAO\", \"Callsign\", \"Country\", \"Active\" from CSVREAD( 'C:\\All_Data\\WorkFile\\Airlines.csv', 'Airline_ID, Name, Alias, IATA, ICAO, Callsign, Country, Active', null ) ");
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	 
	//loading Airports Data
	 static void loadAirportsData(){
		 
		 	Connection conn = null;
			Statement stmt = null;

			try {
				Class.forName("org.h2.Driver");
				conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
				stmt = conn.createStatement();

				stmt.execute("drop table if exists airports");
				stmt.execute(
						"create table airports (Airport_ID varchar(100) primary key, Name varchar(100), City varchar(100), Country varchar(100), IATA varchar(100), ICAO varchar(100), Latitude varchar(100), Longitude varchar(100), Altitude varchar(100), Timezone varchar(100), DST varchar(100), Tz_database_time varchar(100), zone_type varchar(100), Source varchar(100))");
				stmt.execute(
						"insert into airports (Airport_ID, Name, City, Country, IATA, ICAO, Latitude, Longitude, Altitude, Timezone, DST, Tz_database_time, zone_type, Source)     select \"Airport_ID\", \"Name\", \"City\", \"Country\", \"IATA\", \"ICAO\", \"Latitude\", \"Longitude\", \"Altitude\", \"Timezone\", \"DST\", \"Tz_database_time\", \"zone_type\", \"Source\" from CSVREAD( 'C:\\All_Data\\WorkFile\\Airports.csv', 'Airport_ID, Name, City, Country, IATA, ICAO, Latitude, Longitude, Altitude, Timezone, DST, Tz_database_time, zone_type, Source', null ) ");
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	 
	//loading Routes Data
	 static void loadRoutesData(){
		 
		 	Connection conn = null;
			Statement stmt = null;

			try {
				Class.forName("org.h2.Driver");
				conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
				stmt = conn.createStatement();

				stmt.execute("drop table if exists routes");
				stmt.execute(
						"create table routes (Airline varchar(100), Airline_ID varchar(100), Source_airport varchar(100), Source_airport_ID varchar(100), Destination_airport varchar(100), Destination_airport_ID varchar(100), Codeshare varchar(100), Stops varchar(100), Equipment varchar(100))");
				stmt.execute(
						"insert into routes (Airline , Airline_ID , Source_airport , Source_airport_ID , Destination_airport , Destination_airport_ID , Codeshare , Stops , Equipment )     select \"Airline\", \"Airline_ID\", \"Source_airport\" , \"Source_airport_ID\", \"Destination_airport\", \"Destination_airport_ID\", \"Codeshare\", \"Stops\", \"Equipment\" from CSVREAD( 'C:\\All_Data\\WorkFile\\Routes.csv', 'Airline , Airline_ID , Source_airport , Source_airport_ID , Destination_airport , Destination_airport_ID , Codeshare , Stops , Equipment', null ) ");
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
