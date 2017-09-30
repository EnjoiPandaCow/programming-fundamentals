//Program to determine if an inputed integer is divisable by 3
import java.util.Scanner;
    class ex4f
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
        
            int x;
            
            System.out.print("Please enter an integer value: ");
            x = sc.nextInt();
            
            System.out.println("");
            
            if( x%3 == 0)
                System.out.println(x + " is divisable by 3.");
                else
                System.out.println(x + " is not divisable by 3.");
        }
    }    
