package com.RestAPIdemo.RestAPI.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class fligtException {
	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleException (MethodArgumentNotValidException ex) {
		
		Map<String, String> errormap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(err -> {
			errormap.put(err.getField(), err.getDefaultMessage());
		});
		return errormap;
		
	}
	
	
	//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String, String> handleusetnotexception(UserNotFoundException user) {
		Map<String, String> errormap = new HashMap<>();
		errormap.put("FieldList", user.getMessage());
		return errormap;
	}	
		
}
