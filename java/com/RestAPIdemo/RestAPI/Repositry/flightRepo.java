package com.RestAPIdemo.RestAPI.Repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestAPIdemo.RestAPI.Model.flightDetails;
import com.RestAPIdemo.RestAPI.Model.userDetailsList;

@Repository
public interface flightRepo extends JpaRepository<flightDetails, Long> {

	
}
