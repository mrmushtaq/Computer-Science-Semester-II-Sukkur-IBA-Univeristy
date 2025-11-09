import java.util.Scanner;
class Task_3
{
    public static void main(String args[])
    {
        double amount;

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter your Total amount in rupees");
            amount=obj.nextDouble();
        
        System.out.println("You have to pay "+ 2.5/100*amount+" rupees as Zakat");
    }
 }

