// This program is used to calculate the amount of carpet needed in a room 
import java.util.Scanner;
    public class ex3b
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
             // Declaring the two variables needed
            double length;
            double width;
            
            System.out.println("Please input the length of the room");
            length = sc.nextDouble();
            
            System.out.println("Please input the width of the room");
            width = sc.nextDouble();
            
            System.out.println("Carpet needed = " + length*width + " sq.m");
        }
    }       