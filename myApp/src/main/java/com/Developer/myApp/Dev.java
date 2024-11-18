package com.Developer.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	@Autowired //field injection
	private LapTop laptop; //dev is connect to laptop.
	
	/*
	 * // Constructor injection.
	//@Autowired // in constructor injection the autowired is optional.
	public Dev(LapTop laptop) {
		this.laptop = laptop;
	}
	
	
	//Setter injection.
	//@Autowired is must
	public void setLaptop(LapTop laptop) {
		this.laptop = laptop;
	}
	 */
	public void build() {
		laptop.compile();
		System.out.println("Working on the Aswesome Project...");
	}
}
