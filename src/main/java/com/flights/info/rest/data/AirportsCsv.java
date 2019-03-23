package com.flights.info.rest.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*Since we are using h2 in memory database we will not load the data this way*/
public class AirportsCsv {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;

		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		stmt = conn.createStatement();

		stmt.execute("drop table if exists airports");
		stmt.execute(
				"create table airports (Airport_ID varchar(100) primary key, Name varchar(100), City varchar(100), Country varchar(100), IATA varchar(100), ICAO varchar(100), Latitude varchar(100), Longitude varchar(100), Altitude varchar(100), Timezone varchar(100), DST varchar(100), Tz_database_time varchar(100), zone_type varchar(100), Source varchar(100))");
		stmt.execute(
				"insert into airports (Airport_ID, Name, City, Country, IATA, ICAO, Latitude, Longitude, Altitude, Timezone, DST, Tz_database_time, zone_type, Source)     select \"Airport_ID\", \"Name\", \"City\", \"Country\", \"IATA\", \"ICAO\", \"Latitude\", \"Longitude\", \"Altitude\", \"Timezone\", \"DST\", \"Tz_database_time\", \"zone_type\", \"Source\" from CSVREAD( 'C:\\All_Data\\WorkFile\\Airports.csv', 'Airport_ID, Name, City, Country, IATA, ICAO, Latitude, Longitude, Altitude, Timezone, DST, Tz_database_time, zone_type, Source', null ) ");
		/*
		 * ResultSet rs = stmt.executeQuery("select * from csvdata");
		 * 
		 * while (rs.next()) { System.out.println("id " + rs.getInt("id") + " name " +
		 * rs.getString("name") + " age " + rs.getInt("age") ); }
		 */
		stmt.close();
	}
}