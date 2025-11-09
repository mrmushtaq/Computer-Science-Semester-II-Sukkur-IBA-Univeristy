import java.util.Scanner;
class Task_4
{
    public static void main (String args[])
    {
        float Vi, a, Vf;

        Scanner obj=new Scanner (System.in);
        System.out.println("Enter initial velocity ");
            Vi=obj.nextFloat();
        
        System.out.println("Enter acceleration ");
            a=obj.nextFloat();
        
        System.out.println("\nAsuming that Vf=Vi+a");
            Vf=Vi + a;
        System.out.println("So the final velocity will be "+ Vf);
    }
}

