package com.abstraction;

public abstract class Student {
	
	String name="Ram";
	
	static String collegeName="MIT";
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	void fun()
	{
		
	}
	
	static void m2()
	{
		
	}
	
	//abstract method
	abstract void study();  //body will available in child class
	
	abstract double calculateMarks();//body will available in child class
	
	public static void main(String[] args) {
		
		//Student s1=new Student();
	}
}
