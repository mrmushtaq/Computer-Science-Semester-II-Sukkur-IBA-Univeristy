import java.util.Scanner;
class Game
{
    String name;
    private String Country;
    void SetCountry()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Country : ");
        Country = sc.nextLine();
    }
    String GetCountry()
    {
        return Country;
    }

}

public class Program2
{
    public static void main(String args[])
    {
        Game game1=new Game();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name of a game : ");
        game1.name=sc.nextLine();
        game1.SetCountry();
        System.out.println("Name : " + game1.name);
        System.out.println("Country : " + game1.GetCountry());


    }
}