package com.cg.factory.student.test;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.model.student.test.Student;
import com.cg.model.student.test.StudentImpl;

@Component
public class StudentFactoryImpl implements StudentFactory {

	@Override
	public Student create(String name, String rollNum, List<String> colors) {
		System.out.println("StudentFactoryImpl create");
		Student student = new StudentImpl();
		student.setName(name);
		student.setRollNum(rollNum);
		student.setColors(colors);
		return student;
	}

}
