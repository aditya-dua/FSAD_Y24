package com.example.demo.model;

import com.example.demo.entity.Student;

public class StudentGetResponseModel {

	private Student Stu;

	public Student getStu() {
		return Stu;
	}

	public void setStu(Student stu) {
		Stu = stu;
	}

	public StudentGetResponseModel(Student stu) {
		super();
		Stu = stu;
	}

	public StudentGetResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
