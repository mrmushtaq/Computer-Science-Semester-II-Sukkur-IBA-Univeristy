public class BitwiseOperator
{

    public static void main(String args[])
    {

       
        int a  = 5, b=7;
        int ls = 16, rs = -16, rs1 = 16, ls1 = 16;


        System.out.println("  << : " + (ls<<1));

        System.out.println("  >> : " + (rs>>1));


        System.out.println("  >>> : " + (rs1>>>1));

        System.out.println("Hello World : " + (a|b));

        System.out.println("Hello World : " + (a&b));

        System.out.println("Hello World : " + (a^b));

        System.out.println("Hello World : " + ~a);
        
	


    }    
}