class A 
{

	int a;
	
	A()
	{
		System.out.println("Class A constructor Executed : ");
		a = 10;
	}	

	void display()
	{
		System.out.println(" Display Method : Calss A with value a : " +a);
	}



}

public class ClassProgram1
{

	public static void main(String args[])
	{
		A objaa = new A();
		System.out.println("Start of Main : ");
		
		A obja;
		obja = new A();
		
	
	}





}
