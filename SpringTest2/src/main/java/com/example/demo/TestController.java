package com.example.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Resource(name="com.test.demo.TestService")
	TestService testService;
	
	@GetMapping("/add")
	public String add(int value1, int value2) {
		
		String output = testService.add(value1, value2);
		return output;
	}
	
	@GetMapping("/sub")
	public String sub(int value1, int value2) {
		
		String output = testService.sub(value1, value2);
		return output;
	}
	
	@GetMapping("/div")
	public String div(int value1, int value2) {
		
		String output = testService.div(value1, value2);
		return output;
	}
	
	@GetMapping("/mul")
	public String test(int value1, int value2) {
		
		String output = testService.mul(value1, value2);
		return output;
	}
}
