import java.io.OutputStream;
import java.util.Scanner;
class stack
{
    int stackElements[];
    int tos;
    stack(int size)
    {
        stackElements=new int[size];
        tos=-1;
    }

    void push()
    {
        Scanner sc=new Scanner(System.in);
        if(tos == stackElements.length-1)
        System.out.println("Stack is already full..");
        else
        {
          System.out.println("Enter element to push/ add in the stack");
          int  value = sc.nextInt();
          stackElements[++tos]=value;
          System.out.println(stackElements[tos]+ " Added to the stack");
    
        }

    }

    void pop()
    {
        if(tos== -1)
        System.out.println("Sorry! Stack is already Empty.");
        else
        {
            int value=stackElements[tos--];
            System.out.println(fstackElements[tos+1] + " deleted from the index");   
        }
    }

    void display()
    {
        if(tos==-1)
        System.out.println("\nStack is empty, no element to display.");
        else
        {
            System.out.print("Elements of the stack are : ");
            for(int i=0 ; i<=tos; i++)
            {
                System.out.print(stackElements[i] + "\t");
            }
            System.out.println();
        }

    }
}

public class Stack1
{
    public static void main(String []args)
    {
        int size,choice;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter maximum size of the stack : ");
        size=sc.nextInt();

        stack s=new stack(size);


        boolean temp=true;
        while(temp)
        {
            System.out.println("What do you want to do ? Enter your choice : ");
            System.out.println("1. Add elements in the stack");
            System.out.println("2. Remove elements from the stack");
            System.out.println("3. Display elements of the stack");
            System.out.println("4. Exit the program : ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                s.push();
                break;

                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;

                case 4:
                    temp=false;
                    System.out.println("Program closed.\nThank You");
                    break;
                default:
                System.out.println("Invalid Entry try again");

            }
        }

    }
}