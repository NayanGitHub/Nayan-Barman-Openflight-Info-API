package com.flights.info.rest.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*Since we are using h2 in memory database we will not load the data this way*/
public class AirlinesCsv {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;

		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		stmt = conn.createStatement();

		stmt.execute("drop table if exists airlines");
		stmt.execute(
				"create table airlines (Airline_ID varchar(100) primary key, Name varchar(100), Alias varchar(100), IATA varchar(100), ICAO varchar(100), Callsign varchar(100), Country varchar(100), Active varchar(100))");
		stmt.execute(
				"insert into airlines (Airline_ID, Name, Alias, IATA, ICAO, Callsign, Country, Active)     select \"Airline_ID\", \"Name\", \"Alias\", \"IATA\", \"ICAO\", \"Callsign\", \"Country\", \"Active\" from CSVREAD( 'C:\\All_Data\\WorkFile\\Airlines.csv', 'Airline_ID, Name, Alias, IATA, ICAO, Callsign, Country, Active', null ) ");

		ResultSet rs = stmt.executeQuery("select * from airlines");

		/*
		 * while (rs.next()) { System.out.println("id " + rs.getInt("Airline_ID") +
		 * " name " + rs.getString("Name") + " Alias " + rs.getInt("Alias") ); }
		 */

		while (rs.next()) {
			System.out.println("id " + rs.getInt("Airline_ID"));
		}

		stmt.close();
	}
}