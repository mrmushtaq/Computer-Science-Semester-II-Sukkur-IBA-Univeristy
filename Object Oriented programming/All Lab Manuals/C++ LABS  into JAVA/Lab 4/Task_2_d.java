import java.util.Scanner;
class Task_2_d
{
    public static void main(String args[])
    {
        char letter;

        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter a letter");
            letter=obj.next().charAt(0);
        
        switch(letter)
        {
            case 'a':
            case 'A':
            case 'E':
            case 'e':
            case 'I':
            case 'i':		
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("\n\t" + letter + " is vowel\n ");
                break;
            case 'b':
            case 'B':
            case 'C':
            case 'c':
            case 'D':
            case 'd':
            case 'F':
            case 'f':		
            case 'G':
            case 'g':
            case 'H':
            case 'h':
            case 'J':
            case 'j':
            case 'K':
            case 'k':
            case 'L':
            case 'l':		
            case 'M':
            case 'm':
            case 'N':
            case 'n':
            case 'P':
            case 'p':
            case 'Q':
            case 'q':
            case 'R':
            case 'r':		
            case 'S':
            case 's':
            case 'T':
            case 't':
            case 'V':
            case 'v':
            case 'W':
            case 'w':
            case 'X':
            case 'x':		
            case 'Y':
            case 'y':
            case 'Z':
            case 'z':
                System.out.println("\n\t" + letter + " is consonant\n ");
                break;
            default:
                System.out.println("\nInvalid Alphabet\n");  
        }
    }        
}

