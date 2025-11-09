import java.util.Scanner;
class Task_1
{
    public static void main (String args[])
    {
        char ans;
        String dep;
        Scanner obj=new Scanner(System.in);
        System.out.println("\nDo you have student ID card?  (Y/N)");
            ans=obj.next().charAt(0);
        
        if(ans=='N' || ans=='n')
            System.out.println("\nYou are not allowed to enter");
        else if(ans=='Y' || ans=='y')
            {
                System.out.println("\nWhich is you Department? (CS  EE  BBA  EDU)");
                obj.nextLine();
                dep=obj.nextLine();
                if(dep.equals("CS"))
                    System.out.println("Go to Academic Block 1\n");
                else if(dep.equals("EE"))
                    System.out.println("Go to Academic Block 3\n");
                else if(dep.equals("BBA"))
                    System.out.println("Go to Academic Block 2\n");	
                else if(dep.equals("EDU"))
                    System.out.println("Go to Knowledge Center.\n");
                else
                   System.out.println("\nDepartmrnt Not Found.\nThank You...");
            }
        else
        System.out.println("\nPlease provide valid Information (Y/N).\nRun Again\n");
    }
}