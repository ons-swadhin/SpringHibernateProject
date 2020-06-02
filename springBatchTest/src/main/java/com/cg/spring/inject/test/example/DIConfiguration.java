package com.cg.spring.inject.test.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.spring.inject.test.example.service.CorailService;



@Configuration
@ComponentScan(value={"com.cg.spring.inject.test.example.app"})
public class DIConfiguration {

	@Bean
	public Project getMessageService(){
		return new CorailService();
	}
}