package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World API";
	}
	
	@GetMapping("/user")
	public String helloUser(@RequestParam String name) {
		return "Hello "+name+",";
	}
	//https://github.com/aditya-dua/FSAD_Y24
	@GetMapping("/user/{name}")
	public String helloUserPath(@PathVariable("name") String name) {
		return "Hello "+name+","; 
	}
	
	@GetMapping("/{name}/{repo}")
	public String getRepo(@PathVariable("name") String name,@PathVariable("repo") String repo) {
		return "Hello "+name+" Repo: "+repo+","; 
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student(1, "ADITYA", 100);
	}
	
	@PostMapping("/student")
	public String createStudent(@RequestBody Student stu) {
		System.out.println(stu);
		return stu.toString();
	}
	
}
