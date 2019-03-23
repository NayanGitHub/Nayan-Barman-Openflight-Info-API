package com.flights.info.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flights.info.rest.entity.Airlines;

@Repository
public interface AirlinesRepository extends JpaRepository<Airlines, String>{
	

	@Query(value = "select distinct  A.*   from airlines A inner join routes R on A.AIRLINE_ID=R.AIRLINE_ID and R.destination_airport=?1", 
			  nativeQuery = true)
	List<Airlines> findInFlightByAirport(String airport);
	

	@Query(value = "select distinct  A.*  from airlines A inner join routes R on A.AIRLINE_ID=R.AIRLINE_ID and R.source_airport=?1", 
			  nativeQuery = true)
	List<Airlines> findOutFlightByAirport(String airport);

}
