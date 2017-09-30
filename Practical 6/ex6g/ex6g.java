//program that takes in five numbers from the user using a for loop and gives back the average and the total.
import java.util.Scanner;
    public class ex6g
    {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                
                int x;
                int total = 0;
                
                for (x = 1; x <=5; x ++)
                {
                    System.out.print("Please enter a number: ");
                    int num = sc.nextInt();
                    total = num + total;
                }
                
                System.out.println("The total of the numbers is: " + total);
                System.out.print("The average of the numbers is: " + total/5);
        }
    }  