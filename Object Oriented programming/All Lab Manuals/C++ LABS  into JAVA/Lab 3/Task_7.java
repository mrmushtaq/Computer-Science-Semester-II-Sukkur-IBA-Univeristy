import java.util.Scanner;
class Task_7
{
    public static void main(String args[])
    {
        int num1, num2;

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter NO#1.");
            num1=obj.nextInt();
        System.out.println("Enter NO#2.");
            num2=obj.nextInt();

        if(num1>num2)
        System.out.println("\n" + num1 + " is greater than " + num2);
        else if(num1<num2)
        System.out.println("\n" + num1 + " is less than " + num2);
        else
        System.out.println("\nBoth numbers are equal");
    }
}