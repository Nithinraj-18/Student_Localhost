package com.Student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	@Id
	private long id;
	private String name;
	private String college;
	private String cource;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	
	
	
}
