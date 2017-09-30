// This program finds how many notes the users has and how much money
import java.util.Scanner;
    public class ex3e
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
             // Declare 5 variables name
            int num5;
            int num10;
            int num20;
            int notes;
            int money;

            //Inputing the 5 euro notes
            System.out.println("How many 5 Euro notes do you have:");
            num5 = sc.nextInt();
            
            //Inputing the 10 euro notes
            System.out.println("How many 10 Euro notes do you have:");
            num10 = sc.nextInt();
            
            //Inputing the 20 euro notes
            System.out.println("How many 20 Euro notes do you have:");
            num20 = sc.nextInt();
            
            //Doing the calculation to assign to notes variable
            notes = num5 + num10 + num20;
            
            //Doing the calculation to assign to money variable
            money = (num5*5) + (num10*10) + (num20*20);
            
            //Displaying to the user how many notes they have and how much money
            System.out.println("The total number of notes you have is: " + notes);
            System.out.println("The total number of money you have is: " + money);
            
            
          
            
           
         }
    }

