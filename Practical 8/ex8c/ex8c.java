//program that finds the square of a user defined number using a method
import java.util.Scanner;
    public class ex8c
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int num;
            
            System.out.print("Please enter value to be squared: ");
            num = sc.nextInt();
            squareNum(num);
        }
        
        
        public static void squareNum(int num)
        {   
            int answer;
            answer = num*num;
            System.out.println(num + " squared is " + answer);
        }
    }