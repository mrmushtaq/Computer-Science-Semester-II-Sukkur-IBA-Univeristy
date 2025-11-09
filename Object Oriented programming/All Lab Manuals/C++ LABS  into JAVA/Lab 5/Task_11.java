import java.util.Scanner;
class Task_11
{
    public static void main (String args[])
    {
        int num;
        double n, lowest, highest;
        Scanner input=new Scanner (System.in);
        System.out.print("\nHow many numbers do you have ?  ");
            num=input.nextInt();
       
        System.out.print("\nPlease Enter number_1" + "\t");
        lowest=input.nextDouble();
        highest=lowest;

        for(int i=2; i<=num; i++)
        {
            System.out.print("\nPlease Enter number_"+ i + "\t");
                n=input.nextDouble();   
            if(n<=lowest)
                lowest=n;
            else if(n>highest)
                highest=n;
        }
        System.out.print("\nThe highest number is " + highest);
        System.out.print("\nThe Lowest number is " + lowest);
    }
}