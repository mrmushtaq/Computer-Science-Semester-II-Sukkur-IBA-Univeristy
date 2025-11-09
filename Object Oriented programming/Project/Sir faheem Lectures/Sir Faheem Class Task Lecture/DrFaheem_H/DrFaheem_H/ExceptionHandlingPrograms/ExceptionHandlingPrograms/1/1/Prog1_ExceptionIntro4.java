class Prog1_ExceptionIntro4
{

	public static void main(String args[])
	{

		int no1,no2,no3;
		int arr[]={1,2,3,4,5};
		System.out.println("Welcome !");
			no1 = 10;
			no2 = 0;
			no3=0;

		try
			{		
			no3 = no1/no2;
			System.out.println("Array index value !" + arr[9]);
			}

		catch(ArithmeticException e)
			{
			no2 = no1/1;
			System.out.println("catch executed");
			}
	
		System.out.println("End of Program !" + no3);
	}






}