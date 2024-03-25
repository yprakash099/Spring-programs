package com.sathya.springbootex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/data")
	public String Display()
	{
		return "data.html";
	}
	
	@RequestMapping("/students")
	public String Student()
	{
		return "stu.html";
	}
}
