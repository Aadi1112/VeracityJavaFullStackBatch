package com.inheritance;

public class RBI {
	
	 double balance;
	public RBI( double balance) {
		this.balance=balance;
		System.out.println("RBI");
		// TODO Auto-generated constructor stub
	}

	 
	  
	  void deposit(double amount)
	  {
		  if(amount>0)
		  {
			  balance+=amount;
			  System.out.println("deposit success "+balance);
			  
		  }
	  }
	  
	  void withdraw(double amount)
	  {
		  if(amount>0)
		  {
			  if(amount<balance)
			  {
				  balance-=amount;
				  System.out.println("Withdraw Success:"+balance);
			  }
			  else
			  {
				  System.out.println("Insuffient fund");
			  }
		  }
	  }
}
