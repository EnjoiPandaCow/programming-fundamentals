//Program to determine which int is larger
import java.util.Scanner;
    class ex5a
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int a;
            int b;
            int c;
            
            System.out.print("Please enter your first interger value: ");
            a = sc.nextInt();
            
            System.out.print("Please enter your second interger value: ");
            b = sc.nextInt();
            
            System.out.print("Please enter your third interger value: ");
            c = sc.nextInt();
            
            if (a > b && a > c)
                System.out.print(a + " is the biggest interger number.");
                
               else if (b > a && b > c)
                System.out.print(b + " is the biggest interger number.");
                
               else 
               System.out.print(c + " is the biggest interger number."); 
        }
    }