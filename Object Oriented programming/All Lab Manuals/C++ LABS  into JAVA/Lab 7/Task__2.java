import java.util.Scanner;
class Task__2
{
    public static void main (String args[])
    {
        int size, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
            size=input.nextInt();
        
        int a[]=new int[size];
        for( int i=0; i<size; i++)
        {
            System.out.print("Enter value number " + (i+1) + " : ");
                a[i]=input.nextInt();
        }
            
        for(int i=0; i<size ; i++)
            sum+=a[i];
        
            System.out.println("\nThe sum of given numbers is " + sum);	
    }
}


