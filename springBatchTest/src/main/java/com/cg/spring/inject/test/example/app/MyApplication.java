package com.cg.spring.inject.test.example.app;

import org.springframework.stereotype.Component;

import com.cg.spring.inject.test.example.Project;

@Component
public class MyApplication {
	
	private Project project;

	public void setProject(Project project) {
		this.project = project;
	}
	
	public String getModule()
	{
		return this.project.usedModel();
	}

}
