class ThrowsDemo3
{

	public static void main(String args[])
		{
		
		method1();
	
		
		}


	public static void method1()
	{
		try
		{
				throw new IllegalAccessException();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	

	System.out.println("End of PRogram");
	}



}