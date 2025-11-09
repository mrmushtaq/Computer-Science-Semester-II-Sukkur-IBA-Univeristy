import java.util.Scanner;
class ElectricityBill
{
    public static void main(String args[])
    {
        String name;
        int c_units,bill;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name:");
            name=input.nextLine();
        System.out.println("Enter Your Electricity Consumed units:");
            c_units=input.nextInt();
        
        if(c_units>=0 && c_units<=100)
            {  
                bill=c_units*5;                    // per unit price is 5.
                System.out.println("Your billing amount is "+ bill);
            }   
        else if(c_units>100 && c_units<=200)
            {   
                bill=100*5+(c_units-100)*7;       // per unit price is 7 on above 100 units and previous 100 will be charged as per 5.
                System.out.println("Your billing amount is "+ bill);
            }
        else if(c_units>200)
            {
                bill=100*5+(100*7) +(c_units-200)*15;  // per unit price is 15 on above 200 units and same previous criteria do apply as well.

                System.out.println("Your billing amount is "+ bill);
            }
        
        else
        System.out.println("Invalid Entry\n");

    }
}

