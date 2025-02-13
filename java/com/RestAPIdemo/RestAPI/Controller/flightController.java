package com.RestAPIdemo.RestAPI.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogManager;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.RestAPIdemo.RestAPI.Exception.UserNotFoundException;
import com.RestAPIdemo.RestAPI.Model.flightDetails;
import com.RestAPIdemo.RestAPI.Model.userDetailsList;
import com.RestAPIdemo.RestAPI.ServiceImpl.flightService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/flightcontrols")
public class flightController {
	
	 
//	 private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(flightController.class);
	
	@Autowired
	flightService flightService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
    @GetMapping("/welcome")
    @ResponseBody
	public String flight() {
    	System.out.println("Method Called.....");
		return "hello world";
	}
    
    @PostMapping("/saveFlight")
    public String saveFlight ( @RequestBody @Valid flightDetails flightdetails) {
		return flightService.saveFlight(flightdetails);
    }

    @GetMapping("/getFlight/{id}")
    public flightDetails getflight(@PathVariable long id) throws UserNotFoundException {
    //	String valuess = storedValues.get("FLIGHT_NAME").toString();
    //	System.out.println(" hdbjfjkbvj  " + valuess);
		return flightService.getflightdetails(id);
    	
    }
    
    @DeleteMapping("/deleteFlight/{id}")
    public String deleteflight(@PathVariable long id) {
		return flightService.deleteFlight(id);
    	
    }
	
    @GetMapping("/viewsas")
    public ModelAndView returnmodelandvie() {
    	
    	ModelAndView model = new ModelAndView("views");
    	model.addObject("message", "The view can be  return successfully");
    	return model;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/validateUser")
    public String validateUser(@RequestBody userDetailsList userDetails) {
    	System.out.println("sdjhdsjdshjdshjdsjdhs");
		return flightService.validateUserFields(userDetails);
    	
    }
    
}
