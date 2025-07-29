package com.demo;

public class User implements Bank {

	private int id;
	
	private String name;
	
	private String email;
	
	
	void display()
    
	{
		System.out.println("ID    : "+id);
		System.out.println("Name  : "+name);
		System.out.println("Email : "+email);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
