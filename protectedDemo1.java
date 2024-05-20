package nehaproject;

public class protectedDemo1 
{
	
	protected void method1()
	{
		System.out.println("this is method 1");
	}
	
	void method2()
	{
		System.out.println("this is method 1");
	}

	public static void main(String[] args) 
	{
	
		protectedDemo1 pd1=new protectedDemo1();
		
		pd1.method1();
		
		pd1.method2();
	}

}
