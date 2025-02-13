package com.RestAPIdemo.RestAPI.configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class externalBean {
	
	public  externalBean() {
		
		System.out.println(" The Singleton bean Created ");
	}

}
