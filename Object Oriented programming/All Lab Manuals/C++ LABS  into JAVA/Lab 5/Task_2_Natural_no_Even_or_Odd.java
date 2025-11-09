import java.util.Scanner;
class Task_2_Natural_no_Even_or_Odd
{
    public static void main (String args[])
    {
        int range;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a range upto which the loop should run. ");
            range=input.nextInt();
        
        for(int i=1;i<=range;i++)
        {
            if(i%2==0)
            System.out.print("\n" + i + " is Even ");
            else
            System.out.print("\n" + i + " is Odd");
            
        }
    }
}


