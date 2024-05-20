package nehaproject;

import java.util.Scanner;

public class Exceptione1
{

	public static void main(String[] args) 
	{
        
		int a[]=new int[8];  //array declaration 
		Scanner sc =new Scanner(System.in);  //by using scanner class we can take input from user
		System.out.println("Enter the number"); //take the number from user
		int num=sc.nextInt(); //nextInt method of the scanner class to take input
		try
		{
			System.out.println(100/num);

		}
	    catch(ArithmeticException e)
		{
			System.out.println("something went wrong");
		}
		
		  System.out.println("program is completed ");
		  System.out.println("progem is exit");
		}

}
