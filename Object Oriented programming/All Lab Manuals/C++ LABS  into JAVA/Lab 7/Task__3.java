class Task__3
{
    public static void main(String args[])
    {
        int sum=0;
        int average[]={5,10,15,20,25,30,35,40,45,50};
        
        System.out.print("\nThe values of the array are: ");
        for(int i=0; i<10; i++)
        System.out.print(average[i] + " ");
        
        System.out.println();
        for(int i=0; i<10 ; i++)
            sum+=average[i];
        
        System.out.println("\nThe average is " + (sum/10) + "\n");
    }
}