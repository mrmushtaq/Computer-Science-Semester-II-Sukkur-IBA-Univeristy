import java.util.Scanner;
class Table_in_Loop
{
    public static void main(String args[])
    {
        int table;

        Scanner input= new Scanner (System.in);
        System.out.print("\nEnter number to show table. ");
            table=input.nextInt();
        
        for(int i=1;i<=10; i++)
        {
            System.out.print("\n" + table + " * " + i + " = " + (table*i));
        }
    }
}


