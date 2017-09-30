//Program to determine if the user gets a discount on their bill.
import java.util.Scanner;
    class ex4c
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            double bill;
            double discount;
            System.out.print("Enter your bill value: ");
            bill = sc.nextDouble();
            
            discount = bill - (bill*0.05);
            
            if(bill >= 10)
                System.out.println("You're new bill, with discount is " +  discount); 
                else 
                System.out.println("Sorry no discount");
        }
    }