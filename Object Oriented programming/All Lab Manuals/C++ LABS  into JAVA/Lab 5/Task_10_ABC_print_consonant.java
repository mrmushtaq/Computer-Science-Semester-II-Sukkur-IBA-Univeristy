class Task_10_ABC_print_consonant
{
    public static void main (String args[])
    {
	    for (char i='Z'; i>='A'; i--)
	    {
		    if(i!='A' && i!='E' && i!='I' &&i!='O' && i!='U')
		    System.out.print(i + "\t");
	    }
    }
}