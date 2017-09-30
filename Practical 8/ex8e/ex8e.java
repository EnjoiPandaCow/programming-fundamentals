//program that adds two numbers together using a method
import java.util.Scanner;
    public class ex8e
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int num1;
            int num2;
            
            System.out.print("Enter a value: ");
            num1 = sc.nextInt();
            
            System.out.print("Enter a second value: ");
            num2 = sc.nextInt();
            
            System.out.println();
            add(num1, num2);
        }
        
        
        public static void add(int a, int b)
        {
            int answer;
            answer = a+b;
            System.out.println("The sum of " + a + " plus " + b + " is " + answer);
        }
    }