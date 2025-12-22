package com.tap.models;

public class Student {
	private String name;
	private int age;
	private String email;
	private String department;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String email, String department, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.department = department;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student: ["+name+" "+department+" ]";
	}
	
}
