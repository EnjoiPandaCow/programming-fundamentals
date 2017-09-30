////Displays a deposit, withdraw and balance menu to the user and then tells them what each is and counts how many times it does each.
import java.util.Scanner;
    public class ex7g
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
               int withdrawCount = 0;
               int depositCount = 0;
               int balanceCount = 0;
               
               do {
                   System.out.println("Bank Online");
                   
                   System.out.println();
                   
                   System.out.println("1. Withdraw");
                   System.out.println("2. Deposit");
                   System.out.println("3. Balance");
                   System.out.println("4. Account Details");
                   System.out.println("5. Exit");
                   
                   System.out.println();
                   
                   System.out.print("Enter your choice: ");
                   choice = sc.nextInt();
                   
                   System.out.println();
                   
                    switch(choice)
                    {
                        //Withdraw
                        case 1:
                        withdrawCount ++;
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
                        depositCount ++;
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
                        balanceCount ++;
                        System.out.println("Your balance is: " + newBalance);
                        
                        System.out.println();
                        
                        System.out.print("Would you like another option (y/n): ");
                        option = sc.next().charAt(0);
                        System.out.println();
                        System.out.println();
                        break;
                        
                        case 4:
                        System.out.println("You made " + withdrawCount + " withdrawls from your account.");
                        System.out.println("You made " + depositCount + " deposits to your account.");
                        System.out.println("You have checked you balance " + balanceCount + " times.");
                        
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
