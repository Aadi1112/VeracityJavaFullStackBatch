package com.polymorphism;

public class Student {
//
//	//1.No of parameter can be different
//	void study(int hours) {  //1 Param
//
//		System.out.println("Student doing study for  '"+hours+"' Hours ");
//	}
//
//	void study() {  //0 Param
//
//		System.out.println("Student is doing study using laptop");
//	}
	
//	//2.Type of parameter can be different
//		void study(int hours) {  //1 Param
//
//			System.out.println("Student doing study for  '"+hours+"' Hours ");
//		}
//
//		void study(String laptopName) {  //1 Param
//
//			System.out.println("Student is doing study using laptop : "+laptopName);
//		}
	
	//3.Sequence of parameter can be different
			void study(int hours,String s) {  //2 Param

				System.out.println("Student doing study for  '"+hours+"' Hours ");
			}

			int study( String s,int hours) {  //2 Param

				System.out.println("Student is doing study using laptop : "+laptopName);
			    return 100;
			}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.study();
		
		s1.study(8);
	}
}
