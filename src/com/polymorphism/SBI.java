package com.polymorphism;

public class SBI extends RBI {

//	@Override
//	double interestRate()
//	{
//		return 6.5;
//	}

	void getLoan() {
		System.out.println("SBI");
	}
	
	void work()
	{
		
	}

	public static void main(String[] args) {

//		SBI sbi=new SBI();
//		double i=sbi.interestRate();
//		System.out.println(i);

		// Upcasting
		// passing the child object to parent reference is called upcasting

		// Dynamic Dispatch
		// JVM will invoke overrided method at runtime is called dyanamic dispatch

//		RBI sbi=new SBI();
//		sbi.getLoan();
//		double i=sbi.interestRate();
//		System.out.println(i);

		RBI ss = new SBI(); // upcasting

		if (ss instanceof SBI) {
			SBI rbi =  (SBI) ss; //DownCasting //Passign parent class object to child class reference
			rbi.getLoan();
			rbi.interestRate();
			rbi.work();
		}

		// instanceOf Operator
		
		//is used to check wheter particular of which typ...

//		Integer i=100;
//		if (i instanceof Integer) {
//			System.out.println("Correct ahe");
//		} else {
//			System.out.println("Chukty");
//		}
	}
}

//Child - 4BHK