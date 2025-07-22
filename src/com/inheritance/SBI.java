package com.inheritance;

public class SBI extends RBI {

	//default constructor
	
    SBI( double balance)
    {
    	super(balance);//consrtuctor call to the parent class construcotr
    }
	
	double balance=34;
	void deposit(double amount)
	{
		
		super.deposit(amount);
		System.out.println("SBI");
		System.out.println(super.balance);
		System.out.println(this.balance);
	}
	
	public static void main(String[] args) {
		 SBI sbi=new SBI(1000);
//		 sbi.deposit(3434);
//		 sbi.withdraw(1000);
	}
}
