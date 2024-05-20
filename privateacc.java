
package nehaproject;

class privateacc {
      
	
	int i=10;
	
	private void method()
	{
		System.out.println("i am in method ");
	}
	
	private void me()
	{
		System.out.println("i am in method me");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		privateacc pri=new privateacc();
		
		pri.method();
		pri.me();
		
defaultacc decc= new defaultacc();
		
		decc.de();
		decc.def();
		
		
		
	}

}
