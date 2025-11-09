import java.util.Scanner;
class Task__2
{
    public static void main (String args[])
    {
        int No_of_students, No_of_scores, score;
        double average;

        Scanner input=new Scanner(System.in);
        System.out.println("\n\nThe program averages test scores. ");
        System.out.print("\n For how many students do you have scores?  ");
            No_of_students=input.nextInt();
        
        System.out.print("\n How many test scores does each student have?  ");
            No_of_scores=input.nextInt();
        
        for (int h=1; h<=No_of_students; h++)
        {
            double sum=0;
            for(int i=1; i<=No_of_scores;i++)
            { 
            
                System.out.print("Enter score " + i + " for student " + h + " :");
                    score=input.nextInt();
                sum+=score;
            }	
            average=sum/No_of_scores;
            System.out.println("\n The average score for student " + h + " is " + average);
        }
    }
}