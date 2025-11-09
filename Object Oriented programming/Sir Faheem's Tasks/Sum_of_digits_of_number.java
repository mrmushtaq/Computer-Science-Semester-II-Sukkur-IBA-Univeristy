import java.util.Scanner;
class Sum_of_digits_of_number
{
    public static void main (String args[])
    {
        int  n,sum;

        Scanner input= new Scanner(System.in);
       System.out.println("\nEnter a six digit number");
        n=input.nextInt();
        
        System.out.println(n%10);
        System.out.println(n%100/10);
        System.out.println(n%1000/100);
        System.out.println(n%10000/1000);
        System.out.println(n%100000/10000);
        System.out.println(n%1000000/100000);
        sum=n%10+n%100/10+n%1000/100+n%10000/1000+n%100000/10000+n%1000000/100000;
        System.out.println("\nThe sum of digits is "+ sum);
    }
 }


