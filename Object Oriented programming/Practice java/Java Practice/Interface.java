interface A
{
    int i = 10;    // it is by default static final
   // i+=20;        Error
    void f();       // it By default abstract
    void f1();
    void f2();
}
interface AA extends A
{
    void f3();
}
abstract class B implements AA
{
   public void f()
    {
        System.out.println("I am implemented by class B and method of interface A");
    }
}
class BB extends B
{
    public void f1()
    {
        System.out.println("I am implemented by class C and method of interface A");
    }
   public void f2()
    {
        System.out.println("I am implemented by class C and method of interface A");
    }

    public void f3()
    {
        System.out.println("I am implemented by class C ans method of interface AA ");   
    }

}

class Interface
{
	public static void main(String args[])
	{
        BB bb = new BB();
        bb.f();
        System.out.println(bb.i);
        bb.f1();
        bb.f2();
        bb.f3();
        

	}
}