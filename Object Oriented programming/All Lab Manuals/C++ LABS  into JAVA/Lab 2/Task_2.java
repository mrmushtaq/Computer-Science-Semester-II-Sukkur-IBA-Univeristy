import java.util.Scanner;
class Task_2
{
    public static void main (String args[])
    {
        int num;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a six-digit integer number");
            num=obj.nextInt();
        
        System.out.println("\t\t"+num%10);
        System.out.println("\t\t"+num%100/10);
        System.out.println("\t\t"+ num%1000/100);
        System.out.println("\t\t"+num%10000/1000);
        System.out.println("\t\t"+num%100000/10000);
        System.out.println("\t\t"+num%1000000/100000);
    }
}