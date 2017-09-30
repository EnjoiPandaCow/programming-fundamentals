//Program to find the average of two doubles
import java.util.*;
class ex2e
{
 public static void main(String [] args)
 {
     Scanner input = new Scanner(System.in);
     
     double num1;
     double num2;
     double ave;
     
     System.out.print("Enter first decimal number: ");
     num1 = input.nextDouble();
     
     System.out.print("Enter second decimal number: ");
     num2 = input.nextDouble();
     
     ave= (num1+num2)/2;
     
     System.out.print("The average of the two numbers is: " + ave);
 }
} 
