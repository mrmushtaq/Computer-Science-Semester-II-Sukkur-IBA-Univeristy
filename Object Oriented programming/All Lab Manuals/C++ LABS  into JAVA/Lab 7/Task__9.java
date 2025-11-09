class Task__9
{
    public static void main(String args[])
    {
    	int N=5, M=6;      // any integers
        int[] arr1={19,86,32,43,45}, arr2={23,34,23,12,15,20},arr3=new int[N+M];
        System.out.println("The values of first array are: ");
        
            for(int i=0; i<N; i++)
            System.out.print(arr1[i] + " ");

        System.out.println("\n\nThe values of second array are: ");
        
            for(int i=0; i<M; i++)
                System.out.print(arr2[i] + " ");
                
            for( int i=0; i<N;i++)
                arr3[i]=arr1[i];
                
                for( int i=0; i<M;i++)
                arr3[N+i]=arr2[i];
            
        System.out.println("\n\nThe values of third array are: \n");		
            for(int i=0; i<N+M; i++)
                System.out.print(arr3[i] + " ");		
    }
}