class Prog1_ExceptionIntro3
{

	public static void main(String args[])
	{


		System.out.println("Welcome !");
		
			try
			{

			int no1 = 10;
	
			int no2 = no1/0;
			}
			catch(ArithmeticException e)
			{int no1 = 10;
			int no2 = no1/1;
			System.out.println("catch executed");
			}

	
		//System.out.println("End of Program !");
	}






}