package com.Student.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Entity.Student;
import com.Student.Repository.StudentRepository;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	private StudentRepository stdRepo;

	@Override
	public void saveStudent(Student student) {
		 stdRepo.save(student);

	}

	@Override
	public List<Student> getStudent() {
		List<Student> findAll = stdRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(long id) {
	 stdRepo.deleteById(id);
		
	}

	@Override
	public Student getById(long id) {
		 Optional<Student> findById = stdRepo.findById(id);
		 Student student = findById.get();
		return student;
	}

	 
	}

	 


