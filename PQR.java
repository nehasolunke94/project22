package nehaproject;

public class PQR extends MNO implements ABC,xyz
{
     public void m1()
     {
    	 System.out.println("this is m1 from abc");
     }
     
     public void m2()
     {
    	 System.out.println("this is m2 from xyz");
     }
     
     void m4()
     {
    	 System.out.println("this is m4 from pqr");
     }
	public static void main(String[] args) 
	{
          PQR pq=new PQR();
          pq.m2();  //m2 is coming from xyz interface
          pq.m1(); //m1 is coming from abc interface
          pq.m3(); 
          pq.m4();
	}

}
