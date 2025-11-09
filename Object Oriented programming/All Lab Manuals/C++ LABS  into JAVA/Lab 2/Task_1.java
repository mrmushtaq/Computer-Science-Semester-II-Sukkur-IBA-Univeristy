import java.util.Scanner;
class Task_1
{
    public static void main (String args[])
    {
        int a, b;
        float c;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an integer number");
            a=obj.nextInt();
    
       System.out.println("Enter another integer number");
            b=obj.nextInt();
    
        System.out.println("Enter a decimal number");
            c=obj.nextFloat();
    
        System.out.println(a + " and " + b + " are integers and " + c + " is a decimal number");
    
    }
 }

