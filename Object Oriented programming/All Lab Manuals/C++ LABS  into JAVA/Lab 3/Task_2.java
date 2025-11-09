import java.util.Scanner;
class Task_2
{
    public static void main (String args [])
    {
        int per;

        Scanner obj =new Scanner(System.in);
        System.out.println("\nEnter your percentage");
            per=obj.nextInt();

        if(per>=90 && per<=100)
        System.out.println("Your Grade is A1");
        else if (per>=80 && per<90)
        System.out.println("Your Grade is A");
        else if (per>=70 && per<80)
        System.out.println("Your Grade is B");
        else if (per>=60 && per<70)
        System.out.println("Your Grade is C");
        else if (per>=0 && per<60)
        System.out.println("Fail");
        else
        System.out.println("Invalid Entry\n");
    }
}

