//program that takes in a positive or negative number and counts from 0 to that number
import java.util.Scanner;
    public class ex7b
    {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                
                int num;
                int x = 0;
                
                System.out.print("Please enter a postiive or negative number: ");
                num = sc.nextInt();
                
                if (num > 0)
                {
                while (x <= num)
                {
                    System.out.println(x);
                    x = (x+1);
                }
                }
                else
                {
                while (x >= num)
                {
                    System.out.println(x);
                    x = (x-1);
                }
                }  
        }
    }           
        
