import java.util.Scanner;
class Number_in_vertical_form
{
    public static void main (String args[])
    {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a six digit integer number");
            num=input.nextInt();
        
            System.out.println("\t\t" + (num%10));
            System.out.println("\t\t" + (num%100/10));
            System.out.println("\t\t" + (num%1000/100));
            System.out.println("\t\t" + (num%10000/1000));
            System.out.println("\t\t" + (num%100000/10000));
            System.out.println("\t\t" + (num%1000000/100000));
    }
 }


