package nehaproject;

public class DataConversionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		/*int i= 20;
		int j=30;
		String s1="10";
		String s2="20";
		String s ="true";
		System.out.println(s1+s2);
		System.out.println(i+j);
		
	*/
		String s="welcome";
		String s1="10";
		String s2="20";
		String s3="10.567";
		String s4="20.456";
		
		int p =Integer.parseInt(s1);
		
		int q= Integer.parseInt(s2);
		
		double m= Double.parseDouble(s3);
		
		double n= Double.parseDouble(s4);
		
		
		String s5="true";
		
		boolean b5=Boolean.parseBoolean(s5);
		
		System.out.println(b5);
		
		int x=10;
		double d=344.676d;
		char c='s';
		boolean b=false;
		
		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(b);
		
		
		
		
	}

}
