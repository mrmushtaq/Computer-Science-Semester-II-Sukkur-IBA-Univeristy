import java.util.Scanner;

class Problem
{
    long Conversion (int n)
    {
        if(n!=0)
        {  
            return n*Conversion(n-1); 
        }
        else
        {
            return 1;
        }        
    }


}


public class Recurrsion {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();

        Problem f=new Problem();

        for(int i=0; i<=n; i++)
            System.out.println(i +"! = " + f.Conversion(i));
 
    }
    
}

