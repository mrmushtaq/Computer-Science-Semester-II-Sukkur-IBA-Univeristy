class Prog1_ExceptionIntro5
{

	public static void main(String args[])
	{

		int no1,no2,no3,no4;
		int arr[]={1,2,0,4,5};
		System.out.println("Welcome !");
			no1 = 10;
			no2 =0;
			no3=0;
			no4=0;

		try
			{	
			//no4=arr[3];
			//no3 = no1/no2;
			no3 = no1/arr[2];

			}
		
	

		catch(ArithmeticException e)
			{
			no2 = no1/1;
			System.out.println("catch executed");
			}

		catch(ArrayIndexOutOfBoundsException e)
			{
			no4 = arr[4];
			//no3 = no1/no2;
			System.out.println("catch  2 executed");
			}
	

		System.out.println("End of Program !" + no3);
	}






}