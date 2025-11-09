import java.util.Scanner;
class Task_5
{
    public static void main (String args[])
    {
        float distance, time, speed;

        Scanner obj=new Scanner (System.in);
        System.out.println("Enter distance covered by body in kilometers. ");
            distance=obj.nextFloat();
        
        System.out.println("Enter time taken by body in minutes.");
            time=obj.nextFloat();
        
        speed = distance/time;
            System.out.println("The speed of body will be " + speed + " km/min.");

    }
}

