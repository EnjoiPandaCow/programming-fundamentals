//program to tell the user what they have chosen to purchase
import java.util.Scanner;
    public class ex5f
{
        public static void main(String args[])
    {   
                Scanner sc = new Scanner(System.in);
                
                int num;
                
                System.out.println("***** Computers 'R' Us *****");
                System.out.println("1. Computer");
                System.out.println("2. Laptop");
                System.out.println("3. Tablet");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1,2,3 or 4): ");
                num = sc.nextInt();
                
                switch(num)
                {
                    case 1:
                        System.out.println("You have chosen to purchase a computer");
                        break;
                    case 2:
                        System.out.println("You have chosen to purchase a laptop");
                        break;
                    case 3:
                        System.out.println("You have chosen to purchase a tablet");
                        break;
                    case 4:
                        System.out.println("Thank You");
                    default:
                        System.out.println("Invalid Option"); 
      
            }
    }
}
                