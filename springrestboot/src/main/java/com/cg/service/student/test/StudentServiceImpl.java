package com.cg.service.student.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cg.factory.student.test.StudentFactory;
import com.cg.model.student.test.Student;
import com.cg.model.student.test.StudentImpl;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentFactory studentFactory;

	private static String UPLOADED_FOLDER = "C://Data//";

	@Override
	public void createStudent(Student student) {

	}

	@Override
	public void updateStudent(String id, Student student) {

	}

	@Override
	public void deleteStudent(String id) {

	}

	@Override
	public List<Student> getStudents() {
		System.out.println("StudentService -> getStudents ");
		List<Student> students = new ArrayList<>();
		students.add(new StudentImpl("Asif", "1", getColors("Red", "Green", "Blue")));
		students.add(new StudentImpl("Swadhin", "2", getColors("Red", "Green")));
		students.add(new StudentImpl("Shaswat", "3", getColors("Green", "Blue")));

		return students;
	}

	
	@Override
	public Student getStudentById(String id) {

		return studentFactory.create("Corail", id, getColors("Red", "Green", "Blue"));
	}

	@Override
	public void uploadFile(MultipartFile uploadfile) throws IOException {

		saveUploadedFiles(Arrays.asList(uploadfile));

	}

	private void saveUploadedFiles(List<MultipartFile> files) throws IOException {

		for (MultipartFile file : files) {

			if (file.isEmpty()) {
				continue;
			}

			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

		}

	}
	private List<String> getColors(String... colors) {

		List<String> list = new ArrayList<>(Arrays.asList(colors));
		return list;
	}

}
