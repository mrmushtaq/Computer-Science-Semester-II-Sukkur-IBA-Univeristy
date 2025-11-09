import java.util.Scanner;
class Game
{
    int Guess(int n) 
    {
        Scanner input=new Scanner(System.in);
    
        if(n==0)
        {
            System.out.println("Game over..");
            return 1;
        }
        else if(n!=78)
        {
            if(n>78)
            {
                System.out.println("Sorry! This number is greater than the Lucky number. Try again or press 0 to exit");
                n=input.nextInt();
                return Guess(n);
            }
            else
            {
                System.out.println("Sorry! This number is less than the Lucky number. Try again or press 0 to exit");
                n=input.nextInt();
                return Guess(n);
            }
        }
        else
        {
            System.out.println("Congratulations, you Found the lucky number..");
            return 1;

        }

    }
}

class RecurrsionLuckyNumber
{
    public static void main(String[] args) 
    {
        Game g=new Game();
        Scanner input=new Scanner(System.in);

        int n;
        System.out.println("\nGuess the number or press 0 to exit : ");
        n=input.nextInt();
        g.Guess(n);
        

    }
   }
   