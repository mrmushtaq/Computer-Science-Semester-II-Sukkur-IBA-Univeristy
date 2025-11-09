import java.util.Scanner;
class Array
{
    public static void main(String args [])
    {
        int sId[]=new int[5];
        byte sAge[]=new byte[5];
        String sName[]=new String[5];
        char sGender[]=new char[5];
        
        Scanner input = new Scanner(System.in);
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter ID of Student " + (i+1) + " :  ");
                sId[i]=input.nextInt();
                            // Consume the newline character (Could not understand this line)
            input.nextLine();
            
            System.out.print("Enter Name of Student " + (i+1) + " :  ");
                sName[i]=input.nextLine();
            
            System.out.print("Enter Gender (m/f) of Student " + (i+1) + " :  ");
                sGender[i]=input.next().charAt(0);
            
            System.out.print("Enter Age of Student " + (i+1) + " :  ");
                sAge[i]=input.nextByte();
            
                System.out.println("\n");	
        }
               
        for(int i=0; i<5; i++)
        System.out.println(sId[i] + "  " + sName[i] + "  " + sGender[i] + "  " + sAge[i] + "  ");

    }
}


