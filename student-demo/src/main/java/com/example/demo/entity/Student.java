package com.example.demo.entity;

import java.util.Arrays;

public class Student {

	private int id;
	private String email;
	private String name;
	private String password;
	private int [] marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public Student(int id, String email, String name, String password) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", marks="
				+ Arrays.toString(marks) + "]";
	}
	
	
}
