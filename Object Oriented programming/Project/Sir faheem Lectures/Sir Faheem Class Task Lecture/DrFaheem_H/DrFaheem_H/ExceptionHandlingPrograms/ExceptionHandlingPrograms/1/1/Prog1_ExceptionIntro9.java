class Prog1_ExceptionIntro9
{

	public static void main(String args[])
	{
	
		try
		{
			int no1 = 10;
			int no2 = 20;
			//int no3 = no1/no2;

			try
			{
			int no3 = no1/no2;
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[5]);

			}
			catch(ArithmeticException e)
			{
			System.out.println("Inner Catch");
			//System.out.println(e);
			
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		
			System.out.println(" Outer Catch");
			System.out.println(e);
			
		}

		System.out.println(" after Outer Catch");
	}


}