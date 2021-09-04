package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {
	@Autowired
	TestServiceImplementation tsImpl;
	@CrossOrigin
	@GetMapping("/test")
	public List getAllData()
	{
		return tsImpl.allData();
	}

}
