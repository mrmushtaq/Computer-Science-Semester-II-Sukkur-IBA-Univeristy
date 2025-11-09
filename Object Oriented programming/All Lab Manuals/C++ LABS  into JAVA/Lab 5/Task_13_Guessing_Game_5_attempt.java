import java.util.Scanner;
class Task_13_Guessing_Game_5_attempt
{
    public static void main (String args[])
    {
        int guess, attempt=5;
        Scanner input=new Scanner(System.in);
        int i=0;
        while ( i<=attempt)
        {
            if(attempt==0)
            {
               System.out.println("\n\n\nSorry! You lost the Quiz.");
               System.out.println("The Actual number is 49 ");
                break;
            }
            else
            {
                System.out.print("\n Guess the number, Enter your guess: ");
                    guess=input.nextInt();
                
                    if(guess<49)
                        {
                            System.out.print("\nYour guessed number is smaller than the actual number. ");
                            attempt-=1;
                        }
                    else if(guess>49)
                        {
                            System.out.print("\nYour guessed number is greater than the actual number. ");
                            attempt-=1;
                        }
                    else if (guess==49)
                        {
                            System.out.print("\nCongratulations!!, You guessed the number. " + 49);
                            break;
                        }
            }			
            
        }
    }
}