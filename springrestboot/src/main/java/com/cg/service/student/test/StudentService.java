package com.cg.service.student.test;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cg.model.student.test.Student;

public interface StudentService {

	void createStudent(Student student);

	void updateStudent(String id, Student student);

	void deleteStudent(String id);

	List<Student> getStudents();

	Student getStudentById(String id);

	void uploadFile(MultipartFile uploadfile) throws IOException;

}
