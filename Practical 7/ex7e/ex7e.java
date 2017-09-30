//Asks the user to enter a number and then states if its more or less than 10
import java.util.Scanner;
    public class ex7e
    {
        public static void main(String args[])
        {   
               Scanner sc = new Scanner(System.in);
               
               int num;
               int x = 0;
               char reply;
               
              do
              {
               System.out.print("Please enter a number: ");
               num = sc.nextInt();
               
                if(num > 10)
                {
                    for(x=1; x<=4; x = x+1)
                    {
                     System.out.println("Greater than 10");
                    }
                }
                
                if (num < 10)
                {
                    for(x=1; x<=7; x = x+1)
                    {
                        System.out.println("Less than 10");
                    }
                }
                 System.out.print("Enter another number y/n:  ");
                 reply = sc.next().charAt(0);
                 System.out.println();
                
              }while(reply == 'Y' || reply == 'y');
              
              System.out.println("Goodbye");
        }
    }

