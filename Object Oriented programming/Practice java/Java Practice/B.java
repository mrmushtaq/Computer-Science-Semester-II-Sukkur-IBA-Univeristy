interface A
{
    void a();
    void c();
}
public class B implements A
{
    void a()
    {
        System.out.println("I am a of B");
    }
    void b()
    {
        System.out.println("I am b of B");
    }

}


public class Final {
    public static void main(String args[])
    {
        B b = new B();
        b.a();
    }
    
}
