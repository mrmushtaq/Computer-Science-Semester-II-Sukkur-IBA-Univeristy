import java.util.Scanner;
class Practice2
{
    public static void main(String args[])
    {
        String s, m="It's Found";

            if(m=="It's Found")
                System.out.println("Good"); // correct output
            else
                System.out.println("Bad");

            if(m.equals("It's Found")) // correct output
            System.out.println("Wow Good");
            else
            System.out.println("Uff !! Bad");
            
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        s=sc.nextLine();
        if("Mushtaque".equals(s))   //if(s.equals("Mushtaque"))    both correct
        System.out.println("Found Mushtaque"); 
        else if(s.equals("Mushtaque Ali")) // like this both methods are valid
        System.out.println("Found Mushtaque Ali");
        else
        System.out.println("Not found"); 
    }
}