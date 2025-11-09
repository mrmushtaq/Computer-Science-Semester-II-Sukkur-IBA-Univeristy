import java.util.Scanner;

class stack
{
    int tos=-1;
    int stackElements[]={0};
    Scanner sc=new Scanner(System.in);

    void push(int size)
    {
        if(tos == size-1)
        System.out.println("Stack is already full..");
        else
        {
            System.out.println("Enter element to push/ add in the stack");
          int  value = sc.nextInt();
          stackElements[++tos]=value;
    
        }

    }

    void pop()
    {
        if(tos== -1)
        System.out.println("Sorry! Stack is Empty.");
        else
        {
            int value=stackElements[tos--];
            System.out.println("Element deleted");
            
        }


    }

    void display()
    {
        if(tos==-1)
        System.out.println("Stack is empty.");
        else
        for(int i=0 ; i<tos; i++)
        {
            System.out.println("Elements of the stack : "+ stackElements[i]);
        }

    }
}

public class Stack1
{
    public static void main(String []args)
    {
        int size,choice;
        stack s=new stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the stack : ");
        size=sc.nextInt();

        boolean temp=true;
        while(temp)
        {
            System.out.println("Enter choice : ");
            System.out.println("1. Add elements in the stack");
            System.out.println("2. Remove elements from the stack");
            System.out.println("3. Display elements of the stack");
            System.out.println("4. Exit");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    s.pop();
                    break;

                case 2:
                    s.push(size);
                    break;

                case 3:
                    s.display();
                    break;

                case 0:
                    temp=false;
                
                default:
                System.out.println("Invalid Entry try again");

            }
        }

    }
}