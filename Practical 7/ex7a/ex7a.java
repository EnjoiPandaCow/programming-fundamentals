//program that takes in five numbers adds the total and the average using a while loop
import java.util.Scanner;
    public class ex7a
    {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                
                int x = 1;
                double num, total = 0;
                
                while (x < 6)   
                {
                    System.out.print("Please enter a number: ");
                    num = sc.nextDouble();
                    total = total + num;
                    x = x+1;
                }
                
                System.out.println("The total of the numbers is: " + total);
                System.out.println("The average of the numbers is: " + total/5);
                   
        }
    }