class FinallyDemo2
{

	public static void main(String arg[]) 
	{	
		int name[]={1,2,3,4,5};
		    System.out.println("Start of PRogram");
		try
		{
			System.out.println("Hi " +name[2]);
		}
	
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
		
		  System.out.println("Inside finally Block");

		}


	    System.out.println("End of PRogram");
		
	}





}