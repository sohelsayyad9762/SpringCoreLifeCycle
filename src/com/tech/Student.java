package com.tech;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
	private String name;
	
	private int id;
	
	
	public Student() {
		System.out.println("inside StudentConstructor");
	}
	
	@PostConstruct
	public void init() {
		
		System.out.println("inside init method");
		
	}
	
	@PreDestroy  //preeDestroy using to destroy method excute last using close method 
	public void destroy() {
		
		System.out.println("inside destroy Constructor..");
	}
	
	public void setName(String name) {
		System.out.println("inside set Name");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		System.out.println("inside setId");
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
