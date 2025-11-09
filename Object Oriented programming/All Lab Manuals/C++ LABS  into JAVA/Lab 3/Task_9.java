import java.util.Scanner;
class Task_9
{
    public static void main(String args[])
    {
        double num1, num2;
        char oper;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
            num1=obj.nextDouble();
        System.out.println("Enter operator (+ , - , * , /)");
            oper=obj.next().charAt(0);
        System.out.println("Enter another number");
            num2=obj.nextDouble();
            
        if(oper=='+')
            System.out.println("\nThe sum is " + (num1+num2) + "\n");
        else if(oper=='-')
            System.out.println("\nThe subtraction is " + (num1-num2) + "\n");
        else if(oper=='*')
            System.out.println("\nThe product is " + (num1*num2) + "\n");
        else if(oper=='/')
            System.out.println("\nThe division is " + (num1/num2) + "\n");	
        else
            System.out.println("Invalid Entry");            
    }
}

