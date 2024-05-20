package nehaproject;

import java.util.Scanner;

public class Exceptionhandel2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("program is started");
		System.out.println("program is in process");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num =sc.nextInt();		
				
		try
		{
			System.out.println(100/num);
		}
	    catch(ArithmeticException e)
		{
	    	System.out.println("You have enterned invalid number...");
		}
	     

		System.out.println("program is completed");
		System.out.println("program is exited..");
		  
		
	}

}
