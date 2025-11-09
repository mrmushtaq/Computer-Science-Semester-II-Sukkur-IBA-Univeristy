import java.util.Scanner;
class Task_5_a
{
    public static void main (String args[])
	{
        int num=10, a=0;
        
        Scanner input=new Scanner (System.in);
        for (int i=0; i<=num; i++)
        {
            a+=(i+1);
            System.out.print("\t" + a);
        }
    }
}