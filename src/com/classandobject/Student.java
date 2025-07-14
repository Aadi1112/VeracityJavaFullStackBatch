package com.classandobject;

public class Student {
	
	//variables
	//direct initialization is wrong in java
//	int id=101;
//	String name="Siddik";
//	int age=24;
	
	int id;
	String name;
	int age;
	String address;
	long mobileNo;
	String bloodGroup;
	double marks;
	String collegeName;
	long aadharCardNo;
	long panCardNo;
	
	//methods
	//constructor
	//block
	//nested class

	
	public static void main(String[] args) {
		
		//id , name , dep , salary , joiningDate , address , adharcardNo , pancardNo, bloodgroup,isMarried
		//Create Employee Class with 10 Variables
		//Create 10 Object of Employee Class and print the data of 10 Objects
				
		
		//Create Student Class with 10 Variables
		//Create 10 Object of Student Class and print the data of 10 Objects
		
		Student s1=new Student(); //states id name age
		
		s1.id=101;
		s1.name="Siddik";
		s1.age=22;
		s1.address="Pune";
		s1.mobileNo=90920390293L;
	   //	s1.aadharCardNo=029302
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		System.out.println("========================");
	
	
		Student s2=new Student();//states id name age
		s2.id=102;
		s2.name="Chaitanya";
		s2.age=25;
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
  	
	}
}
