package com.abstraction;

public class Test extends Student {

	void study()
	{
		//code
		System.out.println("Doing study using laptop");
	}
	
	double calculateMarks()
	{
		
		return 34.34;
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.study();
		double marks=t.calculateMarks();
	  System.out.println(marks);
	
 	}
	
}
