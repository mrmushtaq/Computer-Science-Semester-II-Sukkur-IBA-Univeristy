import java.util.Scanner;
class Quiz_with_3_chances_on_1st_3_questions_only
{
    public static void main(String args[])
    {
        char ans;
        int score=0;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Quiz App\n\n");
        System.out.println("Enter the correct answer (A,B,C,D), each question carry 10 marks\n");
        System.out.println("Q#1. Who is current Prime Minister of Pakistan  ?");
        System.out.print("\tA. Shahbaz Sharif.");
        System.out.print("\tB. Imran Khan.");
        System.out.print("\tC. Mr. Anwar Ul Haq.");
        System.out.print("\tD. Nawaz Sharif.");
        System.out.print("\n\nYour answer is ....");
            ans=input.next().charAt(0);
        if(ans=='C' || ans=='c')
            {
            score=score+10;
            System.out.print("\nCorrect\n Your current score is " + score);
            }
        else
            {
                System.out.print("\nWrong\n You have still two chances to continue the quiz.");
            }
            
            System.out.println("\nQ#2. When Quaid Azam died ?");
            System.out.print("\tA. 1878");
            System.out.print("\tB. 1950");
            System.out.print("\tC. 1947");
            System.out.print("\tD. 1948");
            System.out.print("\n\nYour answer is ....");
                ans=input.next().charAt(0);

        if(ans=='D' || ans=='d')
            {
                score=score+10;
                System.out.print("\nCorrect\n Your current score is " + score);
            }
        else
            {
                System.out.print("\nWrong\n You have now last chance to continue the quiz.");
            }
                        
            System.out.println("\nQ#3 Which city of Pakistan is known as city of saints ?");
            System.out.print("\tA. Lahore");
            System.out.print("\tB. Multan");
            System.out.print("\tC. Peshawar");
            System.out.print("\tD. Islamabad");
            System.out.print("\n\nYour answer is ....");
                ans=input.next().charAt(0);

        if(ans=='B' || ans=='b')
            {
                score=score+10;
                System.out.print("\nCorrect\n Your current score is  " + score);
            }
        else
            {
                System.out.print("\nWrong\n You lost\n Game over.");
            }
                                
            System.out.println("\nQ#4 Which city of Pakistan is known as city of lights ?");
            System.out.print("\tA. Karachi");
            System.out.print("\tB. Lahore");
            System.out.print("\tC. Peshawar");
            System.out.print("\tD. Islamabad");
            System.out.print("\n\nYour answer is ....");
                ans=input.next().charAt(0);	
        if(ans=='A' ||  ans=='a')
            {
                score=score+10;
                System.out.print("\nCorrect\n Your current score is  " + score);
                System.out.println("\nQ#5 Which city of Pakistan is known as city of perfumes ?");
                System.out.print("\tA. Sialkot");
                System.out.print("\tB. Hayderabad");
                System.out.print("\tC. Peshawar");
                System.out.print("\tD. Islamabad");
                System.out.print("\n\nYour answer is ....");
                    ans=input.next().charAt(0);	

                if(ans=='B' ||  ans=='b')	
                {
                    score=score+10;
                    System.out.print("\nCorrect\n Your current score is  " + score);
                    System.out.println("\nQ#6 What is capital city of Austria ?");
                    System.out.print("\tA. Baku");
                    System.out.print("\tB. Manama");
                    System.out.print("\tC. Viena");
                    System.out.print("\tD. Beijing");
                    System.out.print("\n\nYour answer is ....");
                        ans=input.next().charAt(0);

                    if(ans=='C' ||  ans=='c')
                    {
                        score=score+10;
                        System.out.print("\nCorrect\n Your current score is  " + score);
                        System.out.println("\nQ#7 What is capital city of Spain ?");
                        System.out.print("\tA. Baku");
                        System.out.print("\tB. Dublin");
                        System.out.print("\tC. Madrid");
                        System.out.print("\tD. Beijing");
                        System.out.print("\n\nYour answer is ....");
                            ans=input.next().charAt(0);	

                        if(ans=='C' ||  ans=='c')
                        {
                            score=score+10;
                            System.out.print("\nCorrect\n Your current score is  " + score);
                            System.out.println("\nQ#8 What is capital city of Turkey ?");
                            System.out.print("\tA. Ankara");
                            System.out.print("\tB. Canberra");
                            System.out.print("\tC. Madrid");
                            System.out.print("\tD. Kampala");
                            System.out.print("\n\nYour answer is ....");
                            ans=input.next().charAt(0);	

                            if(ans=='A' ||  ans=='a')
                            {
                                score=score+10;
                                System.out.print("\nCorrect\n Your current score is  " + score);
                                System.out.println("\nQ#9 What is chemical symbol of Iron ?");
                                System.out.print("\tA. I");
                                System.out.print("\tB. Fe");
                                System.out.print("\tC. Fg");
                                System.out.print("\tD. Ag");
                                System.out.print("\n\nYour answer is ....");
                                    ans=input.next().charAt(0);	

                                if(ans=='B' ||  ans=='b')
                                {
                                    score=score+10;
                                    System.out.print("\nCorrect\n Your current score is  " + score);
                                    System.out.println("\nQ#10 How many districts are there in Pakistan ?");
                                    System.out.print("\tA. 150");
                                    System.out.print("\tB. 148");
                                    System.out.print("\tC. 152");
                                    System.out.print("\tD. 154");
                                    System.out.print("\n\nYour answer is ....");
                                        ans=input.next().charAt(0);

                                    if(ans=='D' ||  ans=='d')
                                    {
                                        score=score+10;
                                        System.out.print("\nCorrect\n Congratulations, You have successfully cleared  the quiz, Your score is " + score + " out of 100");
                                    }
                                    else
                                    {
                                        System.out.print("\nWrong\n Your score is  " + score + " out of 100  \nGame over");
                                    }
                                }
                                else
                                {
                                    System.out.print("\nWrong\n Your score is  " + score + " out of 100  \nGame over");
                                }
                            }
                            else
                            {
                                System.out.print("\nWrong\n Your score is  " + score + " out of 100  \nGame over");
                            }
                        }
                        else
                        {
                            System.out.print("\nWrong\n Your score is  " + score + " out of 100  \nGame over");	
                        }
                    }
                    else
                    {
                        System.out.print("\nWrong\n Your score is " + score + " out of 100  \nGame over");	
                    }	                
                }
                else
                {
                    System.out.print("\nWrong\n Your score is  " + score + " out of 100 \nGame over");
                }
            }	
            else
            {
                System.out.print("\nWrong\n Your score is  " + score + " out of 100 \nGame over");	
            }			
    }
 }

