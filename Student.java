package com.klu.springmvchibernate;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Student {
	
	int id;
	String name;
	
	public Student() {
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}