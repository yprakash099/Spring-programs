package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Autowired
	private HomeLoanService homeLoanService;
	@Autowired
	private RealEstateService estateService;
	
	public void  details()
	{
		homeLoanService.loanInfo();
		estateService.realstateInfo();
	}
}
