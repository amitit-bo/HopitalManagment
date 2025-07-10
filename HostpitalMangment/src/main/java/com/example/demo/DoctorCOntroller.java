package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorCOntroller {

	@PostMapping
	String addDoctor()
	{
		return "added";
	}
	
	
	
}
