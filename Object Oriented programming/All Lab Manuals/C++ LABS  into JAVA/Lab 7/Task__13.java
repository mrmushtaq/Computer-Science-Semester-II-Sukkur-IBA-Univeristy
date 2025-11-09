import java.util.Scanner;
class Task__13
{
    public static void main(String args[])
    {
        int size, search, temp=0;
        boolean found=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
            size=input.nextInt();
        
        int arr[]=new int[size];
        for( int i=0; i<size; i++)
        {
            System.out.print("Enter value number " + (i+1) + " : ");
                arr[i]=input.nextInt();
        }
        
        System.out.print("Enter the value you want to search from this array :  ");
            search=input.nextInt();      
        for(int i=0; i<size ; i++)
        {
            if(arr[i]==search)
            {
                temp=i;
                found=true;
                break;
            }            
        }
        
        if(found==true)
        System.out.print(search + " is present in the array at index " + temp);
        else
        System.out.println(search + " is not present in the array...\n");
    }
}