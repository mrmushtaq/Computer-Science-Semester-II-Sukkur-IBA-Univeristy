import java.util.Scanner;
class Task__6
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner input =new Scanner (System.in);
        for (int i=0; i>=0; i++)
        {    
            System.out.print("Enter a number positive number (-->negative number to end program <--) ");
                i=input.nextInt();
            
            if(i>=0 && i<=30) 
                sum+=i;
            else
            {
                if(i>30)
                System.out.println("\nNumber is greater than 30 and won't be calculated. ");
            }            
        }
        System.out.println("\nThe sum of given numbers between 0 and 30 is " + sum);
    }
}