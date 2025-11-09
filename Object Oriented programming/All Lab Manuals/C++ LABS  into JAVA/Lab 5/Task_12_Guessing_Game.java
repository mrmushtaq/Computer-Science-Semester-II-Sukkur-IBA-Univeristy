import java.util.Scanner;
class Task_12_Guessing_Game
{
    public static void main (String args[])
    {
        int guess;
        Scanner input=new Scanner(System.in);
        int i=0;
        while (i>=0)
        {
            System.out.print("\n Guess the number, Enter your guess: ");
                guess=input.nextInt();
                
                if(guess<49)
                System.out.print("\nYour guessed number is smaller than the actual number. ");
                else if(guess>49)
                System.out.print("\nYour guessed number is greater than the actual number. ");	
                else if (guess==49)
                    {
                        System.out.print("\nCongratulations!!, You guessed the number. " + 49);
                        break;
                    }                   				
        }
    }
}


