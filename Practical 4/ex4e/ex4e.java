//Program to determine which integer is larger
import java.util.Scanner;
    class ex4e
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int x;
            int y;
            
            System.out.print("Please enter first integer value: ");
            x = sc.nextInt();
            
            System.out.println("");
            
            System.out.print("Please enter second integer value: ");
            y = sc.nextInt();
            
            System.out.println("");
            
            if(x > y)
                System.out.println(x + " is the larger value.");
                else 
                System.out.println(y + " is the larger value.");    
        }
    }   
