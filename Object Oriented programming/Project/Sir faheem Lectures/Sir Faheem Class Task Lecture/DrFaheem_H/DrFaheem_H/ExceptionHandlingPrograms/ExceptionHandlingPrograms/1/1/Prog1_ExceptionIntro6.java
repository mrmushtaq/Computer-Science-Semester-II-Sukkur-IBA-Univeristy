class Prog1_ExceptionIntro6
{

	public static void main(String args[])
	{

		int no1,no2,no3,no4;
		int arr[]={1,2,3,4,5};
		System.out.println("Welcome !");
			no1 = 10;
			no2 = 0;
			no3=0;
			no4=0;

		try
			{	
			
			no3 = no1/arr[7];
			}


		catch(ArithmeticException e)
			{
			no2 = no1/1;
			System.out.println("Arthmatic caught");
			}

		catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("Array index out of bound caught");
			}
	
				catch(Exception e)
			{

			System.out.println("main exception class");
			}

	
		System.out.println("End of Program !" + no3);
	}






}