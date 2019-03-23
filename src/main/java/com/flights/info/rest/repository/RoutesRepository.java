package com.flights.info.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flights.info.rest.entity.*;

@Repository
public interface RoutesRepository extends JpaRepository<Routes, String>{
	
	@Query(value = "select distinct R.* from airlines A inner join routes R on A.AIRLINE_ID=R.AIRLINE_ID where  R.source_airport=?1 and R.destination_airport=?2 and A.active='Y' order by STOPS", 
			  nativeQuery = true)
	List<Routes> findRoutesBySourceDestFlights(String source_airport, String dest_airport);

}
