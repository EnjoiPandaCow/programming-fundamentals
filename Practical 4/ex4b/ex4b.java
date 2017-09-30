//Program to determine a person's rate of tax
import java.util.Scanner;
    class ex4b
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            double wages;
            System.out.print("Enter your yearly salary: ");
            wages = sc.nextDouble();
            
            if(wages >= 30000)
                System.out.println("Your are taxed at 42%");
                else
                System.out.println("You are taxed at 26%");
        }
    }
        