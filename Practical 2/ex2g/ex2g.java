//Program to find the volume of a 3D rectangle
import java.util.*;
class ex2g
{
 public static void main(String [] args)
 {
     Scanner input = new Scanner(System.in);
     
     double length;
     double width;
     double height;
     double volume;
     
     System.out.print("Enter length of 3D rectangle: ");
     length = input.nextDouble();
     
     System.out.print("Enter width of 3D rectangle: ");
     width = input.nextDouble();
     
     System.out.print("Enter height of 3D rectangle: ");
     height = input.nextDouble();
     
     volume = length*width*height;
     
     System.out.print("The volume of the rectangle is: " + volume);
 }
} 

