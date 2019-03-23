package com.flights.info.rest.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*Since we are using h2 in memory database we will not load the data this way*/
public class RoutesCsv {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;

		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		stmt = conn.createStatement();

		stmt.execute("drop table if exists routes");
		stmt.execute(
				"create table routes (Airline varchar(100), Airline_ID varchar(100), Source_airport varchar(100), Source_airport_ID varchar(100), Destination_airport varchar(100), Destination_airport_ID varchar(100), Codeshare varchar(100), Stops varchar(100), Equipment varchar(100))");
		stmt.execute(
				"insert into routes (Airline , Airline_ID , Source_airport , Source_airport_ID , Destination_airport , Destination_airport_ID , Codeshare , Stops , Equipment )     select \"Airline\", \"Airline_ID\", \"Source_airport\" , \"Source_airport_ID\", \"Destination_airport\", \"Destination_airport_ID\", \"Codeshare\", \"Stops\", \"Equipment\" from CSVREAD( 'C:\\All_Data\\WorkFile\\Routes.csv', 'Airline , Airline_ID , Source_airport , Source_airport_ID , Destination_airport , Destination_airport_ID , Codeshare , Stops , Equipment', null ) ");
		/*
		 * ResultSet rs = stmt.executeQuery("select * from csvdata");
		 * 
		 * while (rs.next()) { System.out.println("id " + rs.getInt("id") + " name " +
		 * rs.getString("name") + " age " + rs.getInt("age") ); }
		 */
		stmt.close();
	}
}