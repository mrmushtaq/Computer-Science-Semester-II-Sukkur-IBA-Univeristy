class A
{
    // Static variable 
    static int i;
    
    // Constructors cannot be Static.  Error 
/* 
    static A()
    {
	i = 200;
        System.out.println("I am Constructor ");
    }
*/


// static block
    static 
    {
        System.out.println("I am static block at top of the list ");
    }
	//i = 90;

    // Static method
    static void Display (int j)
    {
        //this.i = j;  Error ! we cannot use this or super with static variable
        i = 80;
	int nn = 56; 
        System.out.println("Display static " + i + nn);
        
    }

}


// We can not create outer class as static 

//  static class B is error
/* static class B
{
    int j = 100;

    void Display()
    {
        j = 200;
        System.out.println("I am not static display in static class with j = "+ j);
    }
}
*/


class B
{
    static int m = 80;
    static void show()
    {
        System.out.println("I am static method of Outer class B");
    }
    static class C
    {
        static int j = 300;
        void Display()
        {
            System.out.println("I am nested Class as static");
        }
        static void Display(int i)
        {
            System.out.println("static Display with parameter ");
            show();
        }
    }
}

class StaticKeyWord
{
	public static void main(String args[])
	{
		A a= new A();  
        System.out.println("Static value  call through Class A i is " + A.i);   // Correct  ( A.i= 20)
        System.out.println("Static value call through Object a of Class A of i is " + a.i);    // correct  ( a.i= 20)

          a.Display(90);  
      //  A.Display(90);    It is also correct
        System.out.println("Static value  call through Class A i is " + A.i);  // ( A.i= 80)

        B.show();
        
        B.C c = new B.C(); 
       System.out.println("Value of j is " + c.j);
       c.Display();

       B.C.Display(999);   // No need to create object because Display is static

	}
}