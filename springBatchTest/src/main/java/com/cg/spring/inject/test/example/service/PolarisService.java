package com.cg.spring.inject.test.example.service;

import com.cg.spring.inject.test.example.Project;

public class PolarisService implements Project { 
	@Override
	public String usedModel() {
		
		return "Agile";
	}

}
