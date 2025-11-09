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

class B extends A
{

	int b;
	
	B()
	{
		System.out.println("Class B constructor Executed : ");
		b = 20;
	}	

	void display()
	{
		System.out.println(" Display Method : Calss B with value b : " +b);
	}



}

class C extends A
{

	int c;
	
	C()
	{
		System.out.println("Class C constructor Executed : ");
		c = 20;
	}	

	void display()
	{
		System.out.println(" Display Method : Calss C with value c : " +c);
	}



}


public class ClassProgram3
{

	public static void main(String args[])
	{
		
		//A obja = new A();
		//B objb = new B();
		C objc = new C();
		System.out.println("Start of Main : ");
		
		
		
	
	}





}
