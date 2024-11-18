package com.Developer.demoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/")
	public String greet() {
		return "Hello World, Welcome To Kumar App";
	}
}
