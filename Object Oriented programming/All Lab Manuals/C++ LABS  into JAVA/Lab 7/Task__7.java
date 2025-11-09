import java.util.Scanner;
class Task__7
{
    public static void main(String args[])
	{
        int size;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
            size=input.nextInt();
        
        int[] a=new int[size], b=new int[size];  // array1 and array 2 
        for( int i=0; i<size; i++)
        {
           System.out.print("Enter value number " + (i+1) + " : ");
                a[i]=input.nextInt();
        }
            System.out.println("The elements of first array are: ");
            for(int i=0; i<size; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n");
        System.out.println("The elements of second array are: ");
        for(int i=size-1; i>=0; i--)
        {
            b[i]=a[i];
            System.out.print(b[i] + " ");
        }
    }
}