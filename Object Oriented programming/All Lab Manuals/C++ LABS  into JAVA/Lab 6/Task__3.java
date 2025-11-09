import java.util.Scanner;
class Task__3
{
    public static void main(String args[])
    {
        int range;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a range upto which you want to find tables: ");
            range=input.nextInt();
        
        for (int i=1; i<=range; i++)
        {
            System.out.println("table of " + i);
            for (int j=1; j<=10; j++)
                System.out.println(j + " * " + i + " = " + j*i);

            System.out.println();           
        }
    }
}