import java.util.Scanner;
class Task_1
{
    public static void main (String args[])
    {
        int num1, num2;

        Scanner obj=new Scanner(System.in);
        System.out.print("Enter NO#1 : ");
            num1=obj.nextInt();
        System.out.print("\nEnter NO#2 : ");
            num2=obj.nextInt();

        if(num1==num2)
            System.out.println("\n" + num1 + " and " + num2 + " are Equal");
        else
            System.out.println("\n" + num1 + " and " + num2 + " are not Equal");
    }
}

