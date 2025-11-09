import java.util.Scanner;
class Two_D_Array
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        int a[][]=new int[3][3];

        System.out.println("Enter the elements of 3*3 array \n");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Enter the elements of ["+(i)+"]["+(j)+"] array ");
                a[i][j] =input.nextInt();
            }
        }

        System.out.println("\nThis is required Matrix");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}