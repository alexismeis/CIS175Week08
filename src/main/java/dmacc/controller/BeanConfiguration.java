package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Destinations;
import dmacc.beans.Traveler;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Destinations destinations() {
		Destinations bean = new Destinations("Mexico");
		//bean.setCountry("United States");
		//bean.setState("Kansas");
		//bean.setCity("Kansas City");
		return bean;
	}
	
	@Bean
	public Traveler traveler() {
		Traveler bean = new Traveler("Alexis", "Meis");
		return bean;
	}
}
