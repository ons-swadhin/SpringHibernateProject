package com.cg.spring.inject.test.example.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.spring.inject.test.example.DIConfiguration;
import com.cg.spring.inject.test.example.app.MyApplication;



public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		System.out.println(app.getModule());
		
		//close the context
		context.close();
	}

}