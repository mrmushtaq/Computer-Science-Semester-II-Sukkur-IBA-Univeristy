import java.util.Scanner;

public class Marksheet_in_Switchcase
{
    public static void main(String[] args)
    {

        String name,Father_name, group;
        int seatn,eng,ict,math,phy,prog, obtainm,per;

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

        switch (per)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                System.out.print("\nFail");
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                System.out.print("\nGrade D");
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                System.out.print("\nGrade C");
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                System.out.print("\nGrade B");
                break;
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                System.out.println("\n\t\tGrade A");
                break;
                
            default:
                System.out.println("Invalid Entry");
        }
        System.out.println("******************************************************************************");
    }
}
