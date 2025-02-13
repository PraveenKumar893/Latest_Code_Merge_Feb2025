package com.RestAPIdemo.RestAPI.Aspects;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class springAop {
	
	
//	@Around(value = "execution(* com.RestAPIdemo.RestAPI.Controller.*.*(..))")
//	public void beforeLoggerWritter(JoinPoint joinPoint) {
//		
//		System.out.println(" The Method Signature  " + joinPoint.getSignature() + 
//				" : Class Name " + joinPoint.getClass() + " : Date : " + new Date());
//	}

}
