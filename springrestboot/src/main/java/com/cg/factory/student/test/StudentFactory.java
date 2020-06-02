package com.cg.factory.student.test;

import java.util.List;

import com.cg.model.student.test.Student;

public interface StudentFactory {
	
	Student create(String name, String rollNum,List<String> colors);

}
