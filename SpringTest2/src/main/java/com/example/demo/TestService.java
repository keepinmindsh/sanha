package com.example.demo;

import org.springframework.stereotype.Service;

@Service("com.test.demo.TestService")
public class TestService{

	public String add(int value1, int value2) {
		String output = value1 + " + " + value2 + " = " + (value1+value2);
		return output;
	}

	public String sub(int value1, int value2) {
		String output = value1 + " - " + value2 + " = " + (value1-value2);
		return output;
	}

	public String div(int value1, int value2) {
		String output = value1 + " / " + value2 + " = " + (value1/value2);
		return output;
	}

	public String mul(int value1, int value2) {
		String output = value1 + " * " + value2 + " = " + (value1*value2);
		return output;
	}
	
}
