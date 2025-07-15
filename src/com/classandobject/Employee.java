package com.classandobject;

public class Employee {

	
	
	Employee() {
		this(11);// this call -> constructor call
		System.out.println("0 Param Constr");
	}

	Employee(int a) {
		this(12, 12);
		System.out.println("1 Param Constr");
	}

	Employee(int a, int b) {
		
		System.out.println("2 Param constr");
	}

	public static void main(String[] args) {

		Employee ee = new Employee();

	}
}
