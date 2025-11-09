import java.util.Scanner;
int sub(int n1,int n2);
int mul(int n1,int n2);
int div(int n1,int n2);
int rem(int n1,int n2);
class Task__1__a
{
    public static void main(String args[])
    {
        int result,n1, n2;
        Scanner input=new Scanner (System.in);
        System.out.print("Enter a number 1: ");
            n1=input.nextInt();
        System.out.print("Enter a number 2: ");
            n2=input.nextInt();
           
        result=sub(n1,n2);
        System.out.println("\nThe subtraction is " + result);
        result=mul(n1,n2);
        System.out.println("The Multiplication is " + result);
        result=div(n1,n2);
        System.out.println("The Division is " + result);
        result=rem(n1,n2);
        System.out.println("The Remainder is " + result);
        
    }
}

    int sub(int n1, int n2)
        {
            return n1-n2;	
        } 

    int mul(int n1, int n2) 
        {
            return n1*n2;	
        }
        
    int div(int n1, int n2) 
        {
            return n1/n2;
        }

    int rem(int n1, int n2) 
        {
            return n1%n2;
        }