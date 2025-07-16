package TypesOfvariableAndMethods;

import javax.security.auth.login.AccountException;

public class BankAccount  {
	
	//Employee - id , name , address , mobileNo , age ,salary
	//static Variable -> CompanyName , CompanyAddr , Dep ...
	
	
	//Instance Method -> Work(int hours) , projectAssign()
	
	//Static Method -> calculateSalary()

	   //Static Variable
	     
	      //The variable which is created inside class and outside any method..using static keyword is knwon as static variable
	static String bankName;
	static String IFSC_CODE;
	static int totalAccounts;
	//Static Variables value is  common for all objects...
	//Static varibales are deals with Class...
	//We can access Static variables by using ClassName directly..
	
	   //Instance Variable
	      
	        //The Variable which is created inside class and outside any method is known instance variable
	//Instance variable value changing  object to object....
	double balance;//0.0
	String accountHolderName;
	String accountNumber;
	   //Local Variable
	
	
	
	//The variable which is created inside any method or constructor or block or in method , constructor parameter ...
	
	void deposit(double amount)
	{
		
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited : After Deposit : "+balance);
		}
		else
		{
			System.out.println("Invalid amount");
		}
		
		
		
		
		
//		int age=90;//Local variable does not have any default value
//		System.out.println(x);
//		System.out.println(age); //The local variable age may not have been initialized
//		System.out.println(balance);//global variables having default value
		
	}
	
	 BankAccount(double balance, String accountHolderName, String accountNumber) {
		//Parent Class Constructor will call here Object Class
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	    totalAccounts++;
	  }

	void withdraw(double amount)
	{
		if(amount>0)
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println("Withdrawan : Afer Withdraw :"+balance);
			}
			else
			{
				System.out.println("Insuffiecient Balance");
			}
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	static int getTotalAccounts()
	{
		return totalAccounts;
	}
	
	void display()  //Instance Method -> 
	{
		System.out.println("Name : "+accountHolderName);
		System.out.println("BankName :"+bankName );
		System.out.println("AC/No : "+accountNumber);
		System.out.println("IFSC :"+IFSC_CODE);
		System.out.println("Bal : "+balance);
	}
	
	static void createObject()
	{
		BankAccount.bankName="SBI";
		BankAccount.IFSC_CODE="SBIN0012239";
	    BankAccount b1=new BankAccount(2000,"Ram","0394809384038");
	    System.out.println("Before deposit : "+b1.balance);
	    b1.deposit(2000);
	    b1.withdraw(500);
	    b1.display();
	   
	    System.out.println("=====================================");
	    
	    BankAccount b2=new BankAccount(3900,"SHyam","39084094809384");
        System.out.println("Before Deposit : "+b2.balance);
	    b2.deposit(5000);
	    b2.withdraw(3000);
	    b2.display();
		
	   int acs= getTotalAccounts();
	   System.out.println("Total Accounts Created.:"+acs);
		
	}
	
	public static void main(String[] args) {
		
		 createObject();
	}
}
