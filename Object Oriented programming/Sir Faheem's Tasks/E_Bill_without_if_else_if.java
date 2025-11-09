import java.util.Scanner;
class E_Bill_without_if_else_if
{
    public static void main(String args[])
    {

        String name;
        int u_cons;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name=input.nextLine();
        
        System.out.println("Enter Your Electricity Consumed units:");
        u_cons=input.nextInt();
        
        if(u_cons>=0 && u_cons<=100)
        System.out.println("Your Billing amount is "+u_cons*5);
        else
        {
            if(u_cons>100 && u_cons<=200)
            System.out.println("Your Billing amount is "+((u_cons-100)*7 + 100*5));
            else
                {
                    if(u_cons>200 && u_cons<=300)
                    System.out.println("Your Billing amount is "+((u_cons-200)*15 +100*7 + 100*5));
                    else
                        {
                        if(u_cons>300)
                        System.out.println("Your Billing amount is "+((u_cons-300)*15 +100*15 + 100*7 + 100*5));
                        else
                            System.out.print("Invalid Entry: \n\n\n\n\n");
                        }
        
                }
        }
    }
}

