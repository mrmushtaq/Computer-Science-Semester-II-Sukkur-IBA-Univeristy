import java.util.Scanner;
class Task_2_e
{
    public static void main(String args[])
    {
        int num,a;

        Scanner obj= new Scanner (System.in);
            System.out.println("\nEnter a number");
            num=obj.nextInt();
            
            a=num%2;
        
        switch (a)
        {
            case 0:
                System.out.println("\n" + num + " is even\n");
                break;
            case 1:
                System.out.println("\n" + num + " is odd\n");
                break;
            default:
                System.out.println("\nInvalid Entry\n");	    
        }
    }
}