// This program finds the average of four numbers
import java.util.Scanner;
    public class ex3e
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
             // Declare 4 variables name
            double num1;
            double num2;
            double num3;
            double num4;
            double ans;

            //Input the first number
            System.out.println("Please input 1st number:");
            num1 = sc.nextDouble();
            
            System.out.println("Please input 2nd number:");
            num2 = sc.nextDouble();
            
            System.out.println("Please input 3rd number:");
            num3 = sc.nextDouble();
            
            System.out.println("Please input 4th number:");
            num4 = sc.nextDouble();
            
            ans = (num1 + num2 + num3 + num4) / 4;
            
            System.out.println("The average of the numbers is: " + ans);
         }
    }