package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.controller.StudentController;
import com.example.demo.entity.Student;
import com.example.demo.model.StudentCreateRequestPostModel;
import com.example.demo.model.StudentCreateResponsePostModel;
import com.example.demo.model.StudentGetResponseModel;

@Service
public class StudentService {
    

	HashMap<Integer, Student> studentHM;
   
	public StudentCreateResponsePostModel create(StudentCreateRequestPostModel request) {

		if(studentHM == null) {
			studentHM = new HashMap<Integer, Student>();
		}

		int id = getRandomNumber();
		if(studentHM.containsKey(id)) {
			id = getRandomNumber();
		}

		Student s = new Student(id, request.getEmail(), request.getName(), request.getPassword());
		studentHM.put(id, s);

		StudentCreateResponsePostModel response = 
				new StudentCreateResponsePostModel(s.getId(), s.getName(), s.getEmail(), s.getPassword());


		return response;

	}

	public StudentGetResponseModel get(int id) {
		Student s;
		if(studentHM == null) {
			System.out.println("HashMap Not Init");
			return null;
			
		}
		
		if(studentHM.containsKey(id)) {
			s=studentHM.get(id);
			StudentGetResponseModel response = new StudentGetResponseModel(s);
			return response;
		}
		
		else {
			System.out.println("ID Not Found");
			return null;
		}
	}
	
	public ArrayList<Student> getStudents(){
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		if(studentHM == null) {
			System.out.println("Hash Map not initialised");
		}
		for(Map.Entry<Integer, Student> entry:studentHM.entrySet()) {
			stuList.add(entry.getValue());
		}
		
		return stuList;
	}
	
	public String deleteStudent(int id) {
		String response;
		if(studentHM == null) {
			response = "Hash Map not initialised";
			System.out.println("Hash Map not initialised");
		}else if(studentHM.containsKey(id)) {
			Student s = studentHM.remove(id);
			
			response = "Student Deleted : "+s;
			
		}else {
			response = "ID doesnot Exists";
		}
		
		return response;
	}
	

	private int getRandomNumber() {
		int min =1, max= 1000;
		return (int) ((Math.random()*(max-min))+min);
	}
}
