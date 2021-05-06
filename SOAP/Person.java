package com.soap.service.pro;

public class Person {

	private String name;
	private int age;
	private String qualification;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Person(String name, int age, String qualification) {
		super();
		this.name = name;
		this.age = age;
		this.qualification = qualification;
	}
}
