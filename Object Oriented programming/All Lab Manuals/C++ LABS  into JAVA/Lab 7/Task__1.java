import java.util.Scanner;
class Task__1
{
    public static void main (String args[])
    {
        int size;
        Scanner input=new Scanner (System.in);
        System.out.print("Enter a size of array: ");
            size=input.nextInt();
        
        int a[]=new int [size];
        for( int i=0; i<size; i++)
        {
            System.out.print("Enter value number " + (i+1) + " : ");
            a[i]=input.nextInt();
        }
        System.out.println("\nNumbers in reverse order are: ");
        for(int i=size-1; i>=0 ; i--)
        System.out.print(a[i] + " ");
    }
}