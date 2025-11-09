import java.util.Scanner;
class Month_number
{
    public static void main(String args[])
    {
        int number;

        Scanner input= new Scanner(System.in);
        System.out.println("\nEnter a month number (1 to 12)");
        number=input.nextInt();
        
        if(number==1)
        System.out.print("\nThe first month is January");
        else if(number==2)
        System.out.print("\nThe second month is February");
        else if(number==3)
        System.out.print("\nThe third month is March");
        else if(number==4)
        System.out.print("\nThe fourth month is April");
        else if(number==5)
        System.out.print("\nThe fifth month is May");
        else if(number==6)
        System.out.print("\nThe sixth month is June");
        else if(number==7)
        System.out.print("\nThe seventh month is July");
        else if(number==8)
        System.out.print("\nThe eighth month is August");
        else if(number==9)
        System.out.print("\nThe ninth month is September");
        else if(number==10)
        System.out.print("\nThe tenth month is October");
        else if(number==11)
        System.out.print("\nThe Eleventh month is November");
        else if(number==12)
        System.out.print("\nThe twelvith month is December");
        else
        System.out.println("Invalid input");
    }
}

