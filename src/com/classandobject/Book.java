package com.classandobject;

public class Book {

	//Global Variables
	int id;

	String name;

	double price;

	String author;
	
    Book()  //Non-Parameterized
    {
    	System.out.println("Non-Parameterized Constructor called...");
    }
    
    Book(int id,String name,double price,String author) //Parameterized Constructor
    {
    	this.id=id;
		this.name=name;
		this.price=price;
		this.author=author;
		
    	System.out.println("Parameterized Constructor called...");
    	
    	System.out.println("=============================================");
    }
	
	
	//this keyword is used to refer current class instance member

	
	void show()
	{
		System.out.println("Book ID     : " + id);
		System.out.println("Book Name   : " + name);
		System.out.println("Book Price  :" + price);
		System.out.println("Book Author : " + author);

	}

	public static void main(String[] args) {

		//Anonymous Object -> The object which does not have any name..
		 new Book(111,"JAVA",3000,"Aadi").show();;
	
		 new Book(222, "Python", 2000, "Ram").show();;
		
       



	}
}
