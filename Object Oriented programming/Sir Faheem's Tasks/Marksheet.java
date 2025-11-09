import java.util.Scanner;

public class Marksheet
{
    public static void main(String[] args)
    {

        String name,Father_name, group;
        int seatn,eng,ict,math,phy,prog;
        double obtainm,per;

        Scanner input=new Scanner(System.in);
        System.out.println();

        System.out.println("******************************************************************************");
        System.out.println("\t\t\t\tMarks Certificate");
        System.out.println("******************************************************************************\n");

        System.out.println("\t\tBoard of intermediate and Secondary Education Sukkur, Sindh\n\n");

        System.out.print("\tName:                ");
        name=input.nextLine();

        System.out.print("\tFather's Name:       ");
        Father_name=input.nextLine();

        System.out.print("\tGroup:               ");
        group=input.nextLine();

        System.out.print("\tSeat No:             ");
        seatn=input.nextInt();

        System.out.println("\n\n\n******************************************************************************");
        System.out.println("*    \t\tSubject\t\ttotal Marks\t\tObtained Marks       *");
        System.out.println("******************************************************************************");

        System.out.print("    \t\tEnglish    \t     100\t\t          ");
        eng=input.nextInt();

        System.out.print("    \t\tICT        \t     100\t\t          ");
        ict=input.nextInt();

        System.out.print("    \t\tMath       \t     100\t\t          ");
        math=input.nextInt();

        System.out.print("    \t\tPhysics    \t     100\t\t          ");
        phy=input.nextInt();

        System.out.print("    \t\tProgramming\t     100\t\t          ");
        prog=input.nextInt();

        System.out.println();
        

        obtainm=eng+ict+math+phy+prog;
        System.out.println("    \t\tTotal Marks  \t      "+obtainm);

        System.out.println();
        per=(obtainm*100)/500;

        System.out.println("      \t\tPercentage\t     "+per);

        if(per>=80&& per<=100)
        {
            System.out.println("    \t\tGrade        \t  \tA");
            System.out.print("    \t\tStatus      \t \tPass");  
        }
        
        else if(per>=70&& per<80)
        {

            System.out.println("    \t\tGrade      \t    \tB");
            System.out.print("    \t\tStatus      \t \tPass");  
        }

        
        else if(per>=60&& per<70) 
        {
            System.out.println("    \t\tGrade       \t   \tC");
            System.out.print("    \t\tStatus      \t \tPass");
        }

        else if(per>=50&& per<60)
        {
            System.out.println("    \t\tGrade       \t   \tD");
            System.out.print("    \t\tStatus      \t \tPass");
        }
        else if(per<50)
        System.out.println("    \t\tStatus        \t \tFail");

        System.out.println("\n\n");
        System.out.println("******************************************************************************");

    }
}
 
