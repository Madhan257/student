package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentDemo;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo stRepo;
	
	public StudentDemo saveDetails(StudentDemo e) {
		return stRepo.save(e);
	}
}