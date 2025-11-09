import java.util.Scanner;
class Task_7
{
    public static void main (String args[])
    {
        int eng, ict, math, phy, prog;
        float obtainm, per;

        Scanner obj =new Scanner (System.in);
        System.out.println("Enter your English marks");
            eng=obj.nextInt();

        System.out.println("Enter your ICT marks");
            ict=obj.nextInt();

        System.out.println("Enter your math marks");
            math=obj.nextInt();

        System.out.println("Enter your physics marks");
            phy=obj.nextInt();

        System.out.println("Enter your programming marks");
            prog=obj.nextInt();

        System.out.println();
    
        obtainm=eng+ict+math+phy+prog;
        System.out.println("Your obtained marks are " + obtainm);

        per=obtainm/500*100;
        System.out.println("Your percentage is " + per);

    }
}

