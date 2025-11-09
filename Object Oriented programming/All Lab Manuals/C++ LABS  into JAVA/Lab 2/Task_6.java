import java.util.Scanner;
class Task_6
{
    public static void main (String args[])
    {
        float a,b,x;

        Scanner obj=new Scanner(System.in);
            System.out.println("\nThe given equation is x = 2(a+b)-2ab");
            System.out.println("Solve for x\n");
            System.out.println("Enter value of a. ");
                a=obj.nextFloat();
            System.out.println("Enter value of b. ");
                b=obj.nextFloat();
                    x = (2*(a+b)-2*a*b);
            System.out.println("The value of x will be " + x);
    }
}

