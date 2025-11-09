abstract class A
{
    A()
    {
        System.out.println("I am abstract class A");
    }
    abstract void f();

}
class B extends A
{
    B()
    {
        System.out.println("I am class B");
    }

    void f()
    {
        System.out.println("I am method of B inherited abstract method of A");
    }

}

class AbstractClass
{
	public static void main(String args[])
	{
        B b = new B();
        b.f();

	}
}