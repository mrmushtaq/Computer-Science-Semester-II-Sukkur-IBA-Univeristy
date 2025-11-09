import java.util.Scanner;
class Task_2_a
{
    public static void main (String args[])
    {
        char choice, oper;
        double num1, num2;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter NO:#1 and NO:#2");
            num1=obj.nextDouble();
            num2=obj.nextDouble();
       System.out.println("Enter Operator (+ - * / %)");
           oper=obj.next().charAt(0);
        
        switch(oper)
        {
            case '+':
                System.out.println("\n(The Addition) " + num1 + " + " + num2 + " = " + (num1+num2) + "\n");
                break;
            case '-':
                System.out.println("\n(The subtraction) " + num1 + " - " + num2 + " = " + (num1-num2) + "\n");
                break;
            case '*':
                System.out.println("\n(The Product) " + num1 + " * " + num2 + " = " + (num1*num2) + "\n");
                break;
            case '/':
                System.out.println("\n(The division) " + num1 + " / " + num2 + " = " + (num1/num2) + "\n");
                break;
            default:
                System.out.println("\nInvalid Entry\n");	           
        }        
    }
}