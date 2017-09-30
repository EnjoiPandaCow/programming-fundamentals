//Program to find and employees gross pay
import java.util.*;
class ex2f
{
 public static void main(String [] args)
 {
     Scanner input = new Scanner(System.in);
     
     double pay;
     double hours;
     double gross;
     
     System.out.print("Enter your hourly rate of pay: ");
     pay = input.nextDouble();
     
     System.out.print("Enter number of hours worked: ");
     hours = input.nextDouble();
     
     gross = pay*hours;
     
     System.out.print("Your gross pay is: " + gross);
 }
} 

