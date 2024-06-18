package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Student;
import com.nit.repository.StudentRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	 
	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student) {
    System.out.println(student);		
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}
	

}
