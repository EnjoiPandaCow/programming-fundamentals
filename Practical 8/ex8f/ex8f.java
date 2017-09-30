//program that adds three numbers together using a method
import java.util.Scanner;
    public class ex8f
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int num1;
            int num2;
            int num3;
            
            System.out.print("Enter a value: ");
            num1 = sc.nextInt();
            
            System.out.print("Enter a second value: ");
            num2 = sc.nextInt();
            
            System.out.print("Enter a third value: ");
            num3 = sc.nextInt();
            
            System.out.println();
            add(num1, num2, num3);
        }
        
        
        public static void add(int a, int b, int c)
        {
            int answer;
            answer = a+b+c;
            System.out.println("The sum of " + a + " plus " + b + " plus" + c +" is " + answer);
        }
    }