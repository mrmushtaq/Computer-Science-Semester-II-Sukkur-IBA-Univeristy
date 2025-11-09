import java.util.Scanner;
class Task__6
{
    public static void main (String args[])
    {
        int size;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a size of array: ");
            size=input.nextInt();
        System.out.println();
        
        int a[]=new int[size];
        for( int i=0; i<size; i++)
        {
            System.out.print("Enter value number " + (i+1) + " : ");
                a[i]=input.nextInt();
        }
        
        System.out.println("The values on the odd indices are: ");
        for(int i=0; i<size; i++)
        {
            if(i%2!=0)
            System.out.print(a[i] + " ");
        }
    }
}