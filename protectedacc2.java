package nehaproject;

class protect4 extends protectedacc
{
	void method2323()
	{
		System.out.println("method2323");
	}
	
}
public class protectedacc2 {
	
	void methodprotectedacc()
	{
		System.out.println("i am in methodprotectedacc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		protect4 pr= new protect4();
		
		pr.pro();
		pr.method2323();
		pr.protectedaccv1();
	
		
		
	}

}
