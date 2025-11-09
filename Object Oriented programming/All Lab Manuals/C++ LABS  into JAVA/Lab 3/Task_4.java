import java.util.Scanner;
class Task_4
{
    public static void main (String args[])
    {
        int number;

        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter a number");
            number=obj.nextInt();	
        if(number%2==0)
        System.out.println("\n"+ number + " is even");
        else
        System.out.println("\n" + number + " is odd");
    }
}

