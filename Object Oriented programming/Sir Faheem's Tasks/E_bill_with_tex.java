import java.util.Scanner;
class E_bill_with_tex
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
        
        if((c_units>=0) && (c_units<=100))         // per unit price is 5.
        {
                bill=c_units*5;
            if ((bill >=2000) && (bill<=5000))
                System.out.println( "your billing amount with 10% tax is " + (bill+(10/100.0)*bill));
            else if (bill >5000)      
                System.out.println("your billing amount with 20% tax is " +(bill+(20/100.0)*bill));
            else 
                System.out.println("your billing amount is " + bill);
        }
        else if(c_units>100 && c_units<=200)   // per unit price is 7 on above 100 units and previous 100 will be charged as per 5.
            {
                    bill= 100*5+(c_units-100)*7;
                if ((bill >=2000) && (bill<=5000))
                    System.out.println("your billing amount with 10% tax is " + (bill+(10/100.0)*bill));
                else if (bill >5000)
                    System.out.println("your billing amount with 20% tax is " + (bill+(20/100.0)*bill));
                else 
                    System.out.println("your billing amount is " + bill);
            }
         else if(c_units>200)    // per unit price is 7 on above 100 units and previous 100 will be charged as per 5.
            {
                    bill=100*5+(100*7) +(c_units-200)*15;	      	
                if ((bill >=2000) && (bill<=5000))
                    System.out.println("your billing amount with 10% tax is " + (bill+(10/100.0)*bill));
                else if (bill >5000)
                    System.out.println("your billing amount with 20% tax is " + (bill+(20/100.0)*bill));        
                else
                    System.out.println("your billing amount is " + bill);
            }
         else
            System.out.println("Invalid Entry\n\n");
    }
}
    
