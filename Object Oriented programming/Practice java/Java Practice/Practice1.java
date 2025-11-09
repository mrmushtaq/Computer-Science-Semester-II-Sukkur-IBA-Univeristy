class Practice1
{
    public static void main(String args[])
    {
        short a=8;
        short b=2;
        
       // b=b+a;  Error !!
        b+=a;  // Correct 
        System.out.println(a+++b++);
        System.out.println(a + " " + b);

    }
}