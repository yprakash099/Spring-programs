package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedconfig {

	@Bean
	public Doctor doctor()
	{
		Doctor doctor = new Doctor(1001, "Anvesh");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy = new Pharmacy("ApolloPharmacy", "Alnakar Center");
		return pharmacy;
	}
	
	@Bean
	public Patient patient()
	{
		Patient patient = new Patient("prakash", 22, doctor(), pharmacy());
		return patient;
	}
}
