import java.util.Scanner;
class Product_purchase
{
    public static void main (String args[])
    {
        int choice=-1,quantity, book_n=0, tshirt_n=0, shoes_n=0, books_p=0, tshirts_p=0, shoes_p=0, total_bill=0;
        
        Scanner input= new Scanner(System.in);

            while(choice!=0)
            {
                System.out.print("\nEnter any number to select any product no: to buy or enter 0 to exit: ");
                System.out.print("\n1. Books (per item price = 500 ).");
                System.out.print("\n2. T-Shirt (per item price = 700). ");
                System.out.print("\n3. Shoes (per item price = 1000).");
                System.out.print("\n0. Exit the Program. ");
                    choice=input.nextInt();
                
                if(choice==1)
                {
                    System.out.print("\nEnter Quantity: ");
                        quantity=input.nextInt();
                    book_n+=quantity;
                    books_p=book_n*500;		
                }
                
                else if(choice==2)
                {
                    System.out.print("\nEnter Quantity: ");
                        quantity=input.nextInt();
                    tshirt_n+=quantity;
                    tshirts_p=tshirt_n*700;		
                }
                
                else if(choice==3)
                {
                    System.out.print("\nEnter Quantity: ");
                        quantity=input.nextInt();
                    shoes_n+=quantity;
                    shoes_p=shoes_n*1000;		
                }
                
                else if(choice !=0 && choice !=1 && choice !=2 && choice !=3 )
                {
                    System.out.print("\nInvalid Entry");
                }
            }

                System.out.print("\nYou have bought " + book_n + " books (price = " + books_p + " )");
                System.out.print("\nYou have bought " + tshirt_n + " tshirst (price = " + tshirts_p + " )");
                System.out.print("\nYou have bought " + shoes_n + " shoes (price = " + shoes_p + " )");
                
                total_bill+=books_p + tshirts_p + shoes_p;
                System.out.print("\n\nTotal Bill = " + total_bill);   
    }
}

