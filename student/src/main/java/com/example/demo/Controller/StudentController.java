package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentDemo;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	@PostMapping("/addDetails")
	public StudentDemo addInfo(@RequestBody StudentDemo st) {
		return stuService.saveDetails(st);
	}
}