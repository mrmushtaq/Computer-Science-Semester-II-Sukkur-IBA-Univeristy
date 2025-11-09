public class Exc {

	public static void main(String[] args) {
		try
		{
			int data=50/0; //may throw exception 
				int s[] = {1,2,3};	
			System.out.println(s[6]);
		}
            		//handling the exception

		catch(ArithmeticException e)
		{
			int data = 50/2;
                        System.out.println(data);
                      		try
                       		{
                        		int i =data/0;
                       		}
                       		catch(ArithmeticException m)
                      		{   
					int i = 25/2;  System.out.println(i);
				}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("s[6] does not exist");
		}

		System.out.println("rest of the code");
	}
	
}
