package com.RestAPIdemo.RestAPI.ServiceImpl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.RestAPIdemo.RestAPI.Controller.flightController;
import com.RestAPIdemo.RestAPI.Exception.UserNotFoundException;
import com.RestAPIdemo.RestAPI.Model.flightDetails;
import com.RestAPIdemo.RestAPI.Model.userDetailsList;
import com.RestAPIdemo.RestAPI.Repositry.flightRepo;

import com.RestAPIdemo.RestAPI.Repositry.userRepo;

@Service
public class flightService implements UserDetailsService  {
	
	private static Logger logger = LoggerFactory.getLogger(flightService.class);
	
	 @Autowired
	 flightRepo flightRepo;
	 
	 @Autowired
	 jsonTokenServices jsonServices;
	 
	 
	    @Autowired
	    private PasswordEncoder passwordEncoder; // Autowire the PasswordEncoder

	 
	 @Autowired
	 userRepo userRepo;
	 	 
	 @Autowired
	// @Lazy
	 AuthenticationManager authManager;
	 
	 
	@CachePut(cacheNames = "flightUpdate" , key = "#flight.flightId" )
	public String saveFlight(flightDetails flight) {
		// new flightController().mappingvalues(flight.getFlightName());
		 flightRepo.save(flight);
		return "Successed";
	 }
	
	@Cacheable(cacheNames = "flight" , key = "#flightId")		
	public flightDetails getflightdetails(long flightId) throws UserNotFoundException {
		//flightRepo.findById(flightId).isEmpty()
		if(flightRepo.findById(flightId).isEmpty()) {
			throw new UserNotFoundException(" Invalid Flight Detailss ");
		}
		return flightRepo.findById(flightId).get();
	 }

	@CacheEvict(cacheNames = "flightDelete" , key = "#id")
	public String deleteFlight(long id) {
		 flightRepo.deleteById(id);
		return "Successed";
	}

	public String validateUserFields(com.RestAPIdemo.RestAPI.Model.userDetailsList userDetails) {
		logger.debug("The Validate User Method Called");
		UserDetails user =  loadUserByUsername(userDetails.getUserName());
		logger.warn("User Details Values");
	    if (user == null) {
	        return "User not found"; // Handle case where user does not exist
	    }

	    try {	    	
		        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
		        		user.getUsername() , userDetails.getPassword()); 
		        Authentication authenticate = authManager.authenticate(authenticationToken);
		        
	        		
	        if (authenticate.isAuthenticated()) {
	        	return jsonServices.generateTokens(user.getUsername());
	        }
	    } catch (Exception e) {
	        System.err.println("Authentication failed: " + e.getMessage());
	        logger.error("Auth failed");
	        return "Authentication failed: Invalid credentials";
	    }

	    return "Authentication failed"; // General fallback message
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		userDetailsList userlist =   userRepo.findByUserName(username);
		Collection<? extends GrantedAuthority> asas = new ArrayList<>();
		return new User(userlist.getUserName(), userlist.getPassword(), asas) ;
	}


}
