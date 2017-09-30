//Program to find the square of an entered number
import java.util.*;
class ex2c
{
 public static void main(String [] args)
 {
     Scanner input = new Scanner(System.in);
     
     int num;
     System.out.print("Enter an Integer Number: ");
     num = input.nextInt();
     System.out.print(num + " squared is: " + num*num);
 }
} 