package nehaproject;

public class protectedacc {
	
	protected void protectedaccv1()
	{
		System.out.println("i am in method protect");
	}
	void pro()
	{
		System.out.println(" i am in pro class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectedacc pr=new protectedacc();
		
		pr.protectedaccv1();
		pr.pro();

	}

}
