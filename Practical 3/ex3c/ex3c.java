// This program is used to calculate the amount of carpet needed in a room and to calculate the cost of the carpet
import java.util.Scanner;
    public class ex3c
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
            // Declaring the three variables needed
            double length;
            double width;
            
            System.out.println("Please input the length of the room");
            length = sc.nextDouble();
            
            System.out.println("Please input the width of the room");
            width = sc.nextDouble();
            
            double ans = length*width;
            
            System.out.println("Carpet needed = " + ans + " sq.m");
            System.out.println("Cost of Carpet = " + ans*5 + " Euro");
        }
    }       