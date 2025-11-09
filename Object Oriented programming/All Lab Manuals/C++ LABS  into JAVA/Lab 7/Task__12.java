import java.util.Scanner;
class Task__12
{
    public static void main (String args[])
    {
        int size, largest;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of an array : ");
            size=input.nextInt();
        
        System.out.print("Enter number " + 1 + " : ");
            largest=input.nextInt();
        
        int arr[]=new int[size];
        for(int i=1; i<size; i++)
        {
            System.out.print("Enter number " + (i+1) + " :  ");
                arr[i]=input.nextInt();
                
            if(arr[i]>largest)
            largest=arr[i];
        }
    System.out.println("\nThe largest number is " + largest);
    }
}