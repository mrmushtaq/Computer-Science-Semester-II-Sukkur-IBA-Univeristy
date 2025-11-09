import java.util.Scanner;
class A
{
    A()
    {
        System.out.println("Constructor A:");
    }

    void Display()
    {
        System.out.println("Display A: ");
    }
    
    void Display(String S)
    {
        System.out.println("Display A with Parameter " + S);

    }
    
}
class B extends A
{
    B()
    {
        System.out.println("Constructor B:");
    }
    void Display()
    {
        System.out.println("Display B: ");
    }
    B(String S)
    {
        System.out.println("Constructor B with parameter"+ S);
    }
    
    void Display(String S)
    {
        System.out.println("Display B with Parameter " + S);

    }
    
}
class C extends B
{
    C()
    {
        System.out.println("Constructor C:");
    }

    C(String S)
    {
        System.out.println("Constructor C with parameter"+ S);
    }
    void Display()
    {
        System.out.println("Display C: ");
    }

    void Display(String S)
    {
        System.out.println("Display C with Parameter " + S);

    }
    
}

class Inheritance
{
    public static void main(String args[])
    {
        A a=new A();
        System.out.println();

        B b=new B();
        System.out.println();

        C c=new C("Mushtaque 786");
        System.out.println(); 

        c.Display();
        System.out.println();
        c.Display("Mushtaque Ali");
    }
}