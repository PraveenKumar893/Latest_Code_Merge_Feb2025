package com.RestAPIdemo.RestAPI.Repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestAPIdemo.RestAPI.Model.userDetailsList;

public interface userRepo extends JpaRepository<userDetailsList, Integer> {
	
	public  userDetailsList  findByUserName(String username);
	

}
