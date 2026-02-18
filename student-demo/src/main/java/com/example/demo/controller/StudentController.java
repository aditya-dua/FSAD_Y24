package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentCreateRequestPostModel;
import com.example.demo.model.StudentCreateResponsePostModel;
import com.example.demo.model.StudentGetResponseModel;
import com.example.demo.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/test")
	public String test() {
		return "Test API works!";
	}

	@PostMapping("/create")
	public StudentCreateResponsePostModel create(@RequestBody StudentCreateRequestPostModel request) {
		return studentService.create(request);

	}

	@GetMapping("/get/{id}")
	public StudentGetResponseModel get(@PathVariable int id) {
		return studentService.get(id);
	}
	
	@GetMapping("/get")
	public ArrayList<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
}
