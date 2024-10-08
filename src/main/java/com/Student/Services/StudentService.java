package com.Student.Services;

import java.util.List;

import com.Student.Entity.Student;

public interface StudentService {

	
	public void saveStudent(Student student);
 
	public List<Student> getStudent();

	public void deleteById(long id);

	public Student getById(long id);

	 

	 
	 
}
