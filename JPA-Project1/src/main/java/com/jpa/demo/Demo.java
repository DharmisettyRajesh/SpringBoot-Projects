package com.jpa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping("/")
	public String run()
	{
		return "hello docker";
	}

}
