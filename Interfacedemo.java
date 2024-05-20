package nehaproject;
 interface shape
  {
	 int length=10;
	 int width=20;
	 
	 void circle();
	 default void square()
	 {
		 System.out.println("this is square");
	 }
	 static void rectangle()
	 {
		 System.out.println("this is rectangle");
	 }
	 
  }

  public class Interfacedemo implements shape
  {    
	 public void circle()
	  {
		System.out.println("i am in circle");
	  }

	  public static void main(String[] args)
	
	  {
		 Interfacedemo in=new Interfacedemo();
		 
		 in.circle();
		 in.square();
		 shape.rectangle();
       }

}
