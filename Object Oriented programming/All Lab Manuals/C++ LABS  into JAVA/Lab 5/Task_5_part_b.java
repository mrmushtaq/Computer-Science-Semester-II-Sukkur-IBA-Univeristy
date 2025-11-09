import java.util.Scanner;
class Task_5_part_b
{
    public static void main(String args[])
    {
		int num=10, a=0;

        Scanner input = new Scanner(System.in);
        int i=0;
        while ( i<=num)
        {
            a+=(i+1);
            System.out.print("\t" + a);
            i++;
        }
    }
}