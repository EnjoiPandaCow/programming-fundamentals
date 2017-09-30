//Program to determine if the user has entered a vaild month
import java.util.Scanner;
    class ex5b
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int x;
            
            System.out.print("Please enter a month number eg. (1-12): ");
            x = sc.nextInt();
            
            if (x >= 1 && x <= 12)
            System.out.print("Valid month");
            
            else 
            System.out.print("Non valid month");
        }
    }