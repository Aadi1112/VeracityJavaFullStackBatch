package TypesOfvariableAndMethods;

public class Demo {
	
	//1. Without return type and without parameter
	
	//void => which return nothing
   
	void evenNumbersBetween1To100()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
		}
	}
	
	void fun()
	{
		System.out.println("Without return type and without parameter");
	}
	
	//2. Method with parameter and without return type...
	
	void m1(int a,String s)//local variable
	{
		System.out.println(a);
		System.out.println(s);
		
	}
	
	//3. Method with return type but no parameter
	//return type=> The result of method is called return value..
	//the type of that return value is called return type...
	
	
	int m2()
	{
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
	   	
		return sum;
//		int a=10,b=20;
//		int c=a+b;
//		
//		return c;
		
	}
	
	
	char getName()
	{
		return 'A'; //65.0
	}
	
	//4.Method with parameter and with return also
	
	int doAddition(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Demo demo=new Demo();
		demo.evenNumbersBetween1To100();
		demo.m1(23, "Ram");
		int x=demo.m2();
		System.out.println(x);//30
		
		char s=demo.getName();
		System.out.println(s);
		
		int i=demo.doAddition(2000,2000);
		
		System.out.println(i);
	}
	
	

}
