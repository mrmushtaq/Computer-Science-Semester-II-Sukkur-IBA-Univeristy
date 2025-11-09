import java.util.Scanner;
class Task_4_Multiples_of_5
{
    public static void main(String args[])
    {
        int range;
        Scanner input = new Scanner (System.in);
        System.out.print("\nEnter a range upto which the loop should run. ");
            range=input.nextInt();
        
        System.out.println();
        for(int i=1; i<=range; i++)
        {
            if(i%5==0)
            System.out.println(i);
        }
    }
}


