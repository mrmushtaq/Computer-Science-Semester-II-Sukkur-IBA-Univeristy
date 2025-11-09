import java.util.Scanner;
class Task_2_c
{
    public static void main (String args[])
    {
        int num;

        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter month number");
            num=obj.nextInt();
        
        switch(num)
        {
            case 12:
            case  1:
            case 2:
                System.out.println("\nIt is a Winter season. \n");
                break;
            case 3:
            case 4:
                System.out.println("\nIt is a Spring season. \n");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("\nIt is a Summer season. \n");
                break;
            case 10:
            case 11:
                System.out.println("\nIt is a Autumn season. \n");
                break;
            default:
                System.out.println("\nInvalid Month Number\n");	
        }
    }
}

