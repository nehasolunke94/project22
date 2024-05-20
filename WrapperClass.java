package nehaproject;

public class WrapperClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		
		//primitive data types
		
		byte b = 10;
		short s =20;
		int i =30;
		long l =40;
		float f= 50.5f;
		double d=60.5d;
		char c='A';
		boolean b2=true;
		
		System.out.println("before converting");
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b2);
		
		
		//Converting primitive into objects Autoboxing
		
		Byte byteobj=b;
		Short shrotobj=s;
		Integer intobj=i;
		Long longobj = l;
		Float floatobj=f;
		Double doubleobj=60.5d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		
		System.out.println("after converting....");
		
		System.out.println(byteobj.floatValue());
		System.out.println(shrotobj.floatValue());
		System.out.println(intobj.floatValue());
		System.out.println(longobj.floatValue());
		System.out.println(floatobj.intValue());
		System.out.println(doubleobj.floatValue());
		System.out.println(charobj.toString());
		System.out.println(boolobj.toString());
		
		
		
		
		
	}

}
