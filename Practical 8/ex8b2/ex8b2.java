//program that takes prints as many stars to the screen as the user wants using a method
import java.util.Scanner;
    public class ex8b2
    {
        public static void main(String args[])
        {
            printDrawStars(); 
        }
        
        
        public static void printDrawStars()
        {   
            Scanner sc = new Scanner(System.in);
            
            int i;
            int num;
            
            System.out.print("How many stars would you like printed to the screen: ");
            num = sc.nextInt();
            
            System.out.println();
            
            for(i = 1; i <= 50; i = i + 1)
            {
                System.out.print('*');
            }

            System.out.println();
            
            System.out.println("Hello World");
            
            System.out.println();
            
            for(i = 1; i <= 50; i = i + 1)
            {
                System.out.print('*');
            }
        }
    }