package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		int x[]=new int[2];
		
		x[10]=111;
		
		
		
		
//	    int num[][]	=new int[2][2];
//	    
//	    num[0][0]=100;
//	    num[0][1]=200;
//	    
//	    num[1][0]=300;
//	    num[1][1]=400;
//	    
//	    int x[][]= {{100,200,300},{500,600,700}};
//	    
//	    //Courses 
//	       //JAVA
//	         //Core Java
//	         //Advance Java
//	       //Python
//	       //C++
//	    
//	    
//	    for (int i = 0; i < 2; i++) { //Row
//			
//	    	for (int j = 0; j < 3; j++) { //Column
//				
//	    		System.out.print(x[i][j]+" ");
//			}
//	    	System.out.println();
//		}
//	    
//	    
//		
		
		//Product -> add 5 products object --> id , name , price , qty
		
		//Book - add 5 books - id , name , price  , author
		
		//Employee - add 5 employee - id , dep ,address, salary , name , profile
		
//		String names[]= {"Ram","Shyam","Hari"};
//		
//		for (int i = 0; i < names.length; i++) {
//			
//			System.out.println(names[i]);
//		}
		

		User user1=new  User();
		user1.setId(111);
		user1.setName("Ram");
		user1.setEmail("ram@mail.com");
		
		User user2=new  User();
		user2.setId(222);
		user2.setName("aakash");
		user2.setEmail("aakash@mail.com");
		
		
		User user3=new  User();
		user3.setId(333);
		user3.setName("ravi");
		user3.setEmail("ravi@mail.com");
		
		
		
		User users[]=new User[3];
		users[0]=user1;
		users[1]=user2;
		users[2]=user3;
		
		Bank banks[]=new Bank[2];
		
		banks[0]=user1;
		banks[1]=user2;
		
//		for (int i = 0; i < users.length; i++) {
//			
//			if(users[i].getName().equals("Ram"))
//			{
//				users[i].setEmail("Ram@gmail.com");
//				users[i].display();
//
//				System.out.println("=============================");
//
//			}
//			
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	int nums[]= {12,34,56,7,-645};
//	
//	int max=nums[0];
//	
//	for (int i = 0; i < nums.length; i++) {
//		
//		if(nums[i]<max)
//		{
//			max=nums[i];
//		}
//	}
//	
//	System.out.println(max);
//		
		
		
		
		

//		int numbers[]= {22,44,5,6,2,5,7,54};
//		
//		for (int i = 0; i < numbers.length; i++) {
//			
//			if(numbers[i] % 2==1)
//			System.out.println(numbers[i]);
//		}
		
//		int sum=0;
//		int num1[] = { 22, 44, 5, 6 };
//	//	                +   +   +  +
//		int num2[] = { 34, 90, 25, 8 };
//		
//		int num3[]=new int[4];
//		
//		
//		for (int i = 0; i <4; i++) {
//			
//			num3[i]=num1[i]+num2[i];
//		}
//		
//		for (int i = 0; i < num3.length; i++) {
//			
//			System.out.println(num3[i]);
//			
//		}

//		for (int i = 0; i < num1.length; i++) {
//
//			sum=sum+num1[i];
//		}
//		
//		System.out.println(sum);

		// JVM will allocate memory

		// Store 10 Student marks...

//		int marks[]=new int[5];
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter Array Elements..");
//		
//		for(int i=0;i<marks.length;i++)
//		{
//			System.out.println("Enter Element for index : "+i);
//			marks[i]=sc.nextInt();
//		}

		// 100 , 101 , 102 , 103 , 104

//		marks[0]=100;
//		
//		marks[1]=67;
//		
//		marks[2]=88;
//		
//		marks[3]=96;
//		
//		marks[4]=45;

//	  String str= Arrays.toString(marks);	
//		System.out.println(str);
//		for(int i:marks)
//		{
//			System.out.println(i);
//		}

//		for (int i = 0; i < marks.length; i++) {
//			
//			System.out.println("Array Element at index  :'"+i+"' "+marks[i]);
//		}

//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//
//		System.out.println(marks[2]);
//
//		System.out.println(marks[3]);
//
//		System.out.println(marks[4]);

	}
}
