//program that askes the user to enter their name and print it to the screen 1000 times
import java.util.Scanner;
    public class ex6b
    {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                
                int x;
                String name;
                
                System.out.print("Enter your name please: ");
                name = sc.nextLine();
                
                for( x=1; x<=1000; x = x+1)
                {
                    System.out.println(name);
                }
        }
    }