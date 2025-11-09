import java.util.Scanner;
class Arithmatic_operations
{
    public static void main(String args[])
    {
        float num1, num2;
        char oper;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number\n");
            num1=input.nextFloat();
        System.out.print("Enter operator (+ , - , * , / )\n");
            oper=input.next().charAt(0);
        System.out.print("Enter another number\n");
            num2=input.nextInt();
        
        if(oper=='+')
            System.out.print("\nThe sum is " + (num1+num2) + "\n\n");
        else if(oper=='-')
            System.out.print("\nThe subtraction is " + (num1-num2) + "\n\n");
        else if(oper=='*')
            System.out.print("\nThe product is " + (num1*num2) + "\n\n");
        else if(oper=='/')
            System.out.print("\nThe division is " + (num1/num2) + "\n\n");
        else
            System.out.print("Invalid Entry");
    }
}

