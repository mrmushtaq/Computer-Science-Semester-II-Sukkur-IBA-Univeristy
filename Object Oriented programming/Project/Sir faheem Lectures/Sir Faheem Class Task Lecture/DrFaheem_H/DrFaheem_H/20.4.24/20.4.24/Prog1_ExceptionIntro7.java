class Prog1_ExceptionIntro7
{

	public static void main(String args[])
	{

		int no1,no2,no3,no4;
		int arr[]={1,2,3,4,5};
		System.out.println("Welcome !");
			no1 = 10;
			no2 = 5;
			no3=0;
			no4=0;

		try
			{	
			no4=arr[7];
			no3 = no1/no2;
			}

		catch(Exception e)
			{
			no3 = no1;
			no4 = arr[2];
			System.out.println("main exception class");
			}
		
		System.out.println("No3!" + no3 + " \n No:4 " + no4);
		System.out.println("End of Program !" + no3);
	}






}