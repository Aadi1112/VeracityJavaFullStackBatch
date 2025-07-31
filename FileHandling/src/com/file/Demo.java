package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Demo {
	
	   int id;
	   
	   String name;
	   
	   

	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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





	public static void main(String[] args)  {
		
//		File file=new File("C:\\Users\\HP\\Desktop\\aadiandjava\\aadi.txt");
//		if(file.createNewFile())
//		{
//			System.out.println("File created");
//		}
//		else
//		{
//			System.out.println("File already exist");
//		}
		
//		String names[]= {"Ram","Ashok","Rohit"};
//		int a=10,b=20;
//		FileWriter fw=null;
//		PrintWriter pw=null;
//		try {
////			fw=new FileWriter("C:\\Users\\HP\\Desktop\\aadiandjava\\aadi.txt",true);
////		    
////			fw.write(" \n Student Names are : "+Arrays.toString(names));
////		
////		
////			fw.write("\n"+(a+b));
////			
////			fw.write();
////			fw.flush();//to save the data..
////			
////			fw.close();
//			
//			 pw=new PrintWriter("C:\\Users\\HP\\Desktop\\aadiandjava\\aadi.txt");
//		
//			pw.print("We are from India");
//			
//			pw.println(true);
//			Demo demo=new Demo(1, "Ram");
//			pw.println(demo.getId());
//			pw.println(demo.getName());
//			
//			pw.flush();
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			
//				pw.close();
//			
//		}
//		
//		
//		
//		
//		
		
		
		
		
	}
}
