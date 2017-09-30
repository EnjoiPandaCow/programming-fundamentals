//program that draws 50 stars and hello world to the screen using a method
import java.util.Scanner;
    public class ex8b1
    {
        public static void main(String args[])
        {
            printDrawStars(); 
            
            System.out.println();
            System.out.println("Hello World");
            System.out.println();
            
            printDrawStars();
        }
        
        
        public static void printDrawStars()
        {   
            Scanner sc = new Scanner(System.in);
            
            int i;
            
            for(i = 1; i <= 50; i = i + 1)
            {
                System.out.print('*');
            }

        }
    }