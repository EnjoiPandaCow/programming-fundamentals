//program that asks the user how the sweeten their coffee and replys to them
import java.util.Scanner;
    public class ex8d
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int pref;
            menu();
            pref = sc.nextInt();
            do
            {
                if(pref == 1)
                    System.out.println("Aren't you good");
                else if (pref == 2)
                    System.out.println("Too much sugar is not good for you");
                else if (pref == 3)
                    System.out.println("Sweetner is a good alternitave");
                else 
                    System.out.println("Not an option");
            
                System.out.println();
                    
                menu();
                pref = sc.nextInt();
            }while(pref !=4);
        }
        
        
        public static void menu()
        {   
            System.out.println("How do you sweeten your coffee?");
            System.out.println("1. I don't");
            System.out.println("2. With sugar");
            System.out.println("3. With sweetner");
            System.out.println("4. Quit");
        }
    }