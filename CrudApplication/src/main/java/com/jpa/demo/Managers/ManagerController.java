package com.jpa.demo.Managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {
	@Autowired ManagerService obj;
	
	@GetMapping("/getall23")
	public List<Manager> getAll()
	{
		return obj.getall();
	}
	
	@PostMapping("/addmanager23")
	public String addManager(@RequestBody Manager m)
	{
		return obj.addmanager(m);
	}
	
	@PostMapping("/getleads23")
	public List<Employee> getAllleads(@RequestBody Employee e)
	{
		return obj.selectEmployee(e);
	}
}
