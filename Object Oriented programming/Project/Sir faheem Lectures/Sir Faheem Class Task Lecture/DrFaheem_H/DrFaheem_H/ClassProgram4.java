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
		c = 30;
	}	

	void display()
	{
		System.out.println(" Display Method : Calss C with value c : " +c);
	}



}

class D extends C
{

	int d;
	
	D()
	{
		System.out.println("Class D constructor Executed : ");
		d = 40;
	}	

	void display()
	{
		System.out.println(" Display Method : Calss D with value d : " +d);
	}



}

public class ClassProgram4
{

	public static void main(String args[])
	{
		
		//A obja = new A();
		B objb = new B();
		//C objc = new C();
		//D objd = new D();
 
		System.out.println("Start of Main : ");
		
		
		
	
	}





}
