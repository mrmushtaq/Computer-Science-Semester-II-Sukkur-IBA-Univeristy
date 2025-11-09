import java.util.Scanner;
class Task_5
{
    public static void main (String[] args)
    {
        int number;

        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter a number");
            number=obj.nextInt();
        
        if(number>0)
        System.out.println("\n" + number + " is positive number");
        else if(number<0)
        System.out.println("\n" + number + " is negative number");
        else
        System.out.println("\n" + number + " is zero ");		
    }
}

