import java.util.Scanner;
class Task_3_Natural_Even
{
    public static void main(String args[])
    {
        int range;
        Scanner input=new Scanner (System.in);
        System.out.print("\nEnter a range upto which the loop should run. ");
            range=input.nextInt();
        
        for ( int i=0; i<=range; i++)
        {
            if(i%2==0)
            System.out.print("\n" + i);      
        }
    }
}