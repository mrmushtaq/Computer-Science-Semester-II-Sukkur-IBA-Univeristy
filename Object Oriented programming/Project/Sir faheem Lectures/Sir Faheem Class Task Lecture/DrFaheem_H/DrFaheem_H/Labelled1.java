public class Labelled1
{

    public static void main(String args[])
    {

        boolean t = true;
        
        first:
        {
		System.out.println("Start of first Label");
		
		

		second:
		{
			System.out.println("Start of second Label");
			
			
		
			
			third:
			{
			if(t)
			break first;
			System.out.println("Start of third Label");

			}
			
			

			System.out.println("end second block : ");
		
		}	
		
           
	
       	    System.out.println("end first block : ");

        }



        



    }    
}