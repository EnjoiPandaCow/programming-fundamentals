//program that takes in a user defined number and counts from 0 to that number
import java.util.Scanner;
    public class ex6h
    {
        public static void main(String args[])
    {   
                Scanner sc = new Scanner(System.in);
                
                int x; 
                
                System.out.print("Please enter a number: ");
                int num = sc.nextInt();
                
                if (num > 0)
                for (x = 0; x <= num; x ++)
                {
                    System.out.println(x);
                }
                 
                else
                System.out.print("Please enter a number greater than 0");
        }
    }    

                