class Task__4
{
    public static void main (String args[])
    {
        int num[]={19,86,32,43,45}, n[]=new int[5];
        System.out.println("The elements of first array are: ");
        
        for(int i=0; i<5; i++)
        System.out.print(num[i] + " ");

        System.out.println("\n");
        System.out.println("The elements of second array are: ");
        
        for(int i=0; i<5; i++)
        {
            n[i]=num[i];
            System.out.print(n[i] + " ");
        }
    }
}