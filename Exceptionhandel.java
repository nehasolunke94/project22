package nehaproject;

import java.util.Scanner;

public class Exceptionhandel {

	public static void main(String[] args) {
		
		 System.out.println("program is started");
		
		  System.out.println("program is pn progress");
		
		  int a[]=new int[4];  //array declaration 
		
		 /*  a[0]=1;
		  a[1]=2;
		  a[2]=3;
		  a[3]=0;
		  
		  System.out.println(a[3]);
		  */
         
		  Scanner sc = new Scanner(System.in);
         
          System.out.println("enter the number");
         
          int num = sc.nextInt();
          
          System.out.println("the number[0-4]");
         
          int pos = sc.nextInt();  //array index out of bound exception
          
          a[pos]=num;
          
         
         System.out.println(a[pos]);
         
     
         
         
	}

}
