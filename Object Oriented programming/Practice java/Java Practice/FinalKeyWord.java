class A
{
    final int I=10; 
	A()
	{
		System.out.println("Non Parameter constructor A and final I "+ I);
	}
	A(int i)
	{
		System.out.println("Parameter constructor A " + i);
	}

	void Display()
	{
		System.out.println("I am Display Of A  class");
	}

	final void Display(int i)
	{
		System.out.println("I am Display Of A  class with parameter " + i);
	}
}

class B extends A
{
	B()
	{
		super(6);  // here correct
		System.out.println("Non Parameter constructor B");
	//	super();   //Error call to super must be first statement in constructor
	}
	B(int i)
	{
		super(1000);
		System.out.println("Parameter constructor B " + i);	
	}
	void Display()
	{
		super.Display();     // correct
		System.out.println("I am Display Of B  class");
		super.Display(99);		// correct
	}

}
class SuperKeyword
{
	public static void main(String args[])
	{
		B b = new B();  
		B b1 = new B(100);
		b.Display();
	}
 		

}