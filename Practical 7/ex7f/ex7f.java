//Displays a deposit, withdraw and balance menu to the user and then tells them what each is.
import java.util.Scanner;
    public class ex7f
    {
        public static void main(String args[])
        {   
               Scanner sc = new Scanner(System.in);
               
               char option;
               int choice;
               double balance = 100;
               double newBalance = 100;
               double withdraw;
               double deposit;
               
               do {
                   System.out.println("Bank Online");
                   
                   System.out.println();
                   
                   System.out.println("1. Withdraw");
                   System.out.println("2. Deposit");
                   System.out.println("3. Balence");
                   System.out.println("4. Exit");
                   
                   System.out.println();
                   
                   System.out.print("Enter your choice: ");
                   choice = sc.nextInt();
                   
                   System.out.println();
                   
                    switch(choice)
                    {
                        //Withdraw
                        case 1:
                        System.out.print("How much do you want to withdraw: ");
                        withdraw = sc.nextDouble();
                        newBalance =(balance-withdraw);
                        
                        System.out.println();
                        
                        System.out.println("Your new balance is " + newBalance);
                        
                        
                        System.out.println();
                        
                        System.out.print("Would you like another option (y/n): ");
                        option = sc.next().charAt(0);
                        System.out.println();
                        System.out.println();
                        break;
                        
                        //Deposit
                        case 2:
                        System.out.print("How much do you want to deposit: ");
                        deposit = sc.nextDouble();
                        newBalance =(newBalance+deposit);
                        
                        System.out.println();
                        
                        System.out.println("Your new balance is " + newBalance);
                        
                        System.out.println();
                        
                        System.out.print("Would you like another option (y/n): ");
                        option = sc.next().charAt(0);
                        System.out.println();
                        System.out.println();
                        break;
                        
                        //Balance
                        case 3:
                        System.out.println("Your balance is: " + newBalance);
                        
                        System.out.println();
                        
                        System.out.print("Would you like another option (y/n): ");
                        option = sc.next().charAt(0);
                        System.out.println();
                        System.out.println();
                        break;
                        
                        
                        default:
                        option = 'N';
                        break;
                        
                        
                        
                        
               
                    }
               }   while(option == 'Y' || option == 'y');
                   System.out.println("Thank you for using the system");
        }
    }
