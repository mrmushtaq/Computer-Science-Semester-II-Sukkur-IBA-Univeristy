import java.util.Scanner;
class Task_10
{
    public static void main(String args[])
    {
        int id, unit, bill;
        String name;

        Scanner obj = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
            name=obj.nextLine();
        System.out.print("\nEnter your ID number: ");
            id=obj.nextInt();
        System.out.print("\nEnter unit consumed: ");
            unit=obj.nextInt();
        
        if(unit>=0 && unit<200)
        {
            bill=unit*5;
            System.out.println("\nYour electricity bill will be " + bill);
        }
        else if (unit>=200 &&unit<400)
        {
            bill=199*5 + (unit-199)*10;
            System.out.println("\nYour electricity bill will be " + bill);
        }
        else if (unit>=400 &&unit<500)
        {
            bill=199*5 +199*10 + (unit-199-199)*15;
            System.out.println("\nYour electricity bill will be " + bill);
        }
        else if (unit>=500)
        {
            bill=199*5 +199*10+199*15 + (unit-199-199-199)*20;
            System.out.println("\nYour electricity bill will be " + bill);
        }
        else
        System.out.println("Error occurred");
    }
}

