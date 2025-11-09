import java.util.Scanner;
class Task_2_b
{
	public static void main (String args[])
	{
		int num;

        Scanner obj=new Scanner (System.in);
		System.out.println("\nEnter month number");
			num=obj.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println("\n\tThe 1st month is January\n");
				break;
			case 2:
				System.out.println("\n\tThe 2nd month is February\n");
				break;
			case 3:
            System.out.println("\n\tThe third month is March\n");
				break;
			case 4:
            System.out.println("\n\tThe fourth month is April\n");
				break;
			case 5:
            System.out.println("\n\tThe Fifth month is May\n");
				break;
			case 6:
			System.out.println("\n\tThe Sixth month is June\n");
				break;
			case 7:
            System.out.println("\n\tThe Seventh month is July\n");
				break;
			case 8:
            System.out.println("\n\tThe Eighth month is August\n");
				break;
			case 9:
            System.out.println("\n\tThe Ninth month is September\n");
				break;
			case 10:
            System.out.println("\n\tThe tenth month is October\n");
				break;
			case 11:
            System.out.println("\n\tThe eleventh month is November\n");
				break;
			case 12:
            System.out.println("\n\tThe Twelvith month is December\n");
				break;
			default:
			System.out.println("\nInvalid Month Number\n\n");	
		}
	}
}

