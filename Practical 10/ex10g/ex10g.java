import java.util.*;
public class ex10g
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       
       double [] numbers = new double [10];
       
       lessThan(numbers, sc);       
       
       
       
       
       
   }
   
   public static double[] lessThan(double [] numbers, Scanner sc)
   {
       for (int i = 0; i < numbers.length; i = i + 1)
       {
           System.out.print("Please enter a number: ");
           numbers[i] = sc.nextDouble();
           System.out.println();
       }
        
       
       for (int j = 0; j < numbers.length; j = j + 1)
       {
           if(numbers[j] < 5 )
           {
               System.out.print(numbers[j] + " is less than 5");
               System.out.println();
               System.out.println();
            }
        }
       
       return numbers;
   }
}
