package com.cg;

import java.io.IOException;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cg.model.student.test.Student;
import com.cg.service.student.test.StudentService;

@RestController
@Validated
@CrossOrigin
public class StudentResource {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("students")
	public List<Student> getStudents() {
		
		return studentService.getStudents();
	}
	
	
	@RequestMapping(value = "/students/{studId}", method = RequestMethod.GET)
	@ResponseBody
	Student getStudentById(
			@PathVariable 
			@Min(value = 1, message = "id must be greater than or equal to 1") 
    		@Max(value = 1000, message = "id must be lower than or equal to 1000")
			final String studId
			
			) {

	  return studentService.getStudentById(studId);
	}
	
	@RequestMapping(value = "/students/upload", method = RequestMethod.POST)
	@ResponseBody
	public void uploadFile(
            @RequestParam("file") MultipartFile uploadfile) throws IOException {
		studentService.uploadFile(uploadfile);
	}


	
	
}
