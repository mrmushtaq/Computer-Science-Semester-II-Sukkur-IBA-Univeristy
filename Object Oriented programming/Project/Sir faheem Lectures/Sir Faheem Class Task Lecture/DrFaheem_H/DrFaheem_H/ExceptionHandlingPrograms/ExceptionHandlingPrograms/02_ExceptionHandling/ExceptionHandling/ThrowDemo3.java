class ThrowDemo3
{

	public static void main(String args[])
		{

		System.out.println("Start of Program");
		try
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		catch (Exception e)
		{
			System.out.println(e);
			throw e;
		}
		
		//System.out.println("After throw"); 
		

		}






}