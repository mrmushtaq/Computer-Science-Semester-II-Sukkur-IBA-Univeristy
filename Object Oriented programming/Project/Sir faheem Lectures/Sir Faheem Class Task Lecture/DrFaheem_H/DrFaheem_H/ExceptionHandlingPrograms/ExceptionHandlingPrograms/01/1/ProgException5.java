import java.util.Scanner;

class ProgException5
{


	public static void main(String args[])

	{
	
	Scanner sc= new Scanner(System.in);

	System.out.println("\n Start of Program");

	int no1 = 10;
	int no2 = 0;
	int no3= 0;
	int a[]={1,2,3,4,5};

	

	try
		{		
				no3 = no1/no2;      // error

		}
	
	catch (ArithmeticException e)
		{
		System.out.println(e);
		System.out.println("\n Inside Arithmatic Exception");
		if (no2==0)
			{
			no2=1;
			}
		
		no3 = no1/no2;      // error
		}
	

	try
		{		
		    System.out.println("\n Array[9] : " + a[9]);

		}
	catch (ArrayIndexOutOfBoundsException e)
		{
		System.out.println("\n Inside ArrayIndexOutOfBoundsException Exception");
		System.out.println("Array indexing should be between 0-4 - Please input within range");
		int n = sc.nextInt();
		System.out.println("\n Array[" + n + "] : " + a[n]);
		
		}

	System.out.println("\n No 3 : " +no3);
	System.out.println("\n End of Program");
	
	}



}