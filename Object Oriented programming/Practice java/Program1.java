import java.util.Scanner;
class Program1 
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        Player Mushtaque=new Player();
        System.out.print("Enter Name : ");
        Mushtaque.name=sc.nextLine();
        System.out.println("Name : " + Mushtaque.name);
        Mushtaque.SetRanking();
        System.out.println("Ranking : " + Mushtaque.GetRanking());

    }
    
}

class Player
{
    Scanner sc=new Scanner(System.in);
    String name;
    private int Ranking;

    void SetRanking()
    {
        System.out.print("Enter Ranking : ");
        Ranking=sc.nextInt();
    }
    int GetRanking()
    {
        return Ranking;
    }
}
