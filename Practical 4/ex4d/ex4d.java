//Program to determine what salery a user gets
import java.util.Scanner;
    class ex4d
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int num;
            
            System.out.println("Please enter your Salesperson Status: ");
            System.out.println("Enter 1 for Senior Salesperson.");
            System.out.println("Enter 2 for Junior Salesperson.");
            System.out.println("");
            num = sc.nextInt();
            
            if(num == 1)
                System.out.println("Your Salary is 400 Euro");
                else
                System.out.println("Your Salary is 290 Euro");
        }
    }    
    