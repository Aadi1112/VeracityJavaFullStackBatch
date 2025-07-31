package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	void createFile() throws IOException
	{
		File file=new File("C:\\Users\\HP\\Desktop\\aadiandjava\\student.txt");
		if(file.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File ALready Exist");
		}
	}
	
	void writeDataIntoFile()
	{
		Student s1=new Student(1,"Ram",45.45);
		Student s2=new Student(2,"Hari",95.45);
		Student s3=new Student(3,"aakash",90.45);
		
		
		//Employee , Book , User
		
		
		FileWriter fw=null;
		try {
			 fw=new FileWriter("C:\\Users\\HP\\Desktop\\aadiandjava\\student.txt");
	
			 fw.write("=============First Student================\n");
			 fw.write("\nID     : "+s1.getId());
			 fw.write("\nName   : "+s1.getName());
			 fw.write("\nMarks  : "+s1.getMarks());
			 
			 fw.write("=============Second Student================\n");
			 fw.write("\nID     : "+s2.getId());
			 fw.write("\nName   : "+s2.getName());
			 fw.write("\nMarks  : "+s2.getMarks());
			 
			 
			 fw.write("=============Third Student================\n");
			 fw.write("\nID     : "+s3.getId());
			 fw.write("\nName   : "+s3.getName());
			 fw.write("\nMarks  : "+s3.getMarks());
		
			 
			 fw.flush();
		
			 System.out.println("Writeen");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
				
	}
	
	public static void main(String[] args) {
		
		FileHandling fl=new FileHandling();
		
		try {
			fl.writeDataIntoFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
