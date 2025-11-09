
class A 

{
	int a, b;

	public String toString()
	{
		return " A " + a + " B " + b;
	}


}

class toStringCheck
{

	public static void main(String args[]) throws Exception
		{
		
		A o = new A();
		o.a = 10;
		o.b=20;
		

		System.out.println(o);
		
		}

}