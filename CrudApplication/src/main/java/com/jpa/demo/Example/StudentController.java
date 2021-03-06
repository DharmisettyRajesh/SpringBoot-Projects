package com.jpa.demo.Example;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController { 
	@Autowired 
	StudentService ss;  
	
	Logger log=LoggerFactory.getLogger(StudentController.class);
	
	@PostMapping("/insert23")
	public String  insert23(@RequestBody Student s)
	{
		log.info("sgdddfhsdfs");
		String fjgs=ss.insert(s);
		return fjgs;
	}
	
	@GetMapping("/getall")
	public List<Student> GetAllDetails()
	{
		List<Student> ls=ss.select();
		return ls;
	}
	

}
