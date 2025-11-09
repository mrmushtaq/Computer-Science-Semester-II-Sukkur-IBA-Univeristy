class Task__8
{
    public static void main(String args[])
    {
        int[] arr1={19,86,32,43,45}, arr2={23,34,23,12,15},sum=new int[5];
        System.out.println("The elements of first array are: ");
        
            for(int i=0; i<5; i++)
            System.out.print(arr1[i] + " ");

        System.out.println("\n");
        System.out.println("The elements of second array are: ");
        
        for(int i=0; i<5; i++)
            System.out.print(arr2[i] + " ");
            
        for(int i=0; i<5;i++)
            sum[i]=arr1[i]+arr2[i];
                
        System.out.println("\n");
        System.out.println("The sum of both arrays: ");	
            for(int i=0; i<5; i++)
            System.out.print(sum[i] + " ");
    }
}