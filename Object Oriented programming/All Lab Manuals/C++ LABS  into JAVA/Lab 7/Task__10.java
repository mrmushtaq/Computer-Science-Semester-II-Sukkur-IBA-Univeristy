import java.util.Scanner;
class Task__10
{
    public static void main (String args[])
    {
        int size;
        Scanner input=new Scanner (System.in); 
        System.out.print("Input the number of students for which records are to be entered: ");
            size=input.nextInt();
        
        int[] aPF=new int[size],aMath=new int[size],aEnglish=new int[size],aPS=new int[size],Totalmarks=new int[size];
        String aName[]=new String[size];
        float percentage[]=new float[size];
        char grade[]=new char[size];
        
        System.out.println("Enter the names of all students: ");
        input.nextLine();
        for(int i=0; i<size; i++)
        {
            System.out.print((i+1)+". ");
            aName[i]=input.nextLine();
        }
            
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter marks of Programing of " + aName[i] + " : ");
                aPF[i]=input.nextInt();	
        }
        
        System.out.println();
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter marks of Math of "  + aName[i] + " : ");
                aMath[i]=input.nextInt();
        }
                    
        System.out.println();
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter marks of English of " + aName[i] + " : ");
                aEnglish[i]=input.nextInt();
        }
        
        System.out.println();
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter marks of PS of " + aName[i] + " : ");
                aPS[i]=input.nextInt();              
        }

        for(int i=0; i<size; i++)
        Totalmarks[i]=aPF[i]+aMath[i]+aEnglish[i]+aPS[i];
        System.out.println();
        
        for(int i=0; i<size; i++)
        percentage[i]=(float)(Totalmarks[i]*100/400);

        System.out.println();
        for(int i=0; i<size; i++)
        {
            if(percentage[i]>=80 &&percentage[i]<=100)
            grade[i]='A';
          
            else if(percentage[i]>=70 &&percentage[i]<80)
            grade[i]='B';
                
            else if(percentage[i]>=60 &&percentage[i]<70)
            grade[i]='C';
        
            else if(percentage[i]<60)
            grade[i]='F';    
        }

        System.out.println("\nName\tProgramming    Math     English     P.S     Total Obtained    Percentage     Grade\n");

        for(int i=0; i<size; i++)
        System.out.print(aName[i] + "    " + aPF[i] + "\t\t  " + aMath[i] + "\t     " + aEnglish[i] + "\t    " + aPS[i] + "\t\t  " + Totalmarks[i] + "\t\t" + percentage[i] + "\t      " + grade[i] + "\n");
    }
}