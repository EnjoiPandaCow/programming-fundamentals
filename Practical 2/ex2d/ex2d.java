//Program to find the are of a rectangle
import java.util.*;
class ex2d
{
 public static void main(String [] args)
 {
     Scanner input = new Scanner(System.in);
     
     double num1;
     double num2;
     double ans;
     
     System.out.print("Enter an value for width of rectangle: ");
     num1 = input.nextDouble();
     
     System.out.print("Enter an value for length of rectangle: ");
     num2 = input.nextDouble();
     
     ans= num1*num2;
     
     System.out.print("The area of the rectangle is: " + ans);
 }
} 
