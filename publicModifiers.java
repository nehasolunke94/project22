package nehaproject;

public class publicModifiers {
	
	
	int i=10;
	
	void m1()
	{
		System.out.println("i am in method m1");
	}
	void m2()
	{
		System.out.println("i am in method m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 publicModifiers pm=new publicModifiers();
		 
		 
		 pm.m1();
		 pm.m2();
		
	}

}
