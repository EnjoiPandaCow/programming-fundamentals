/* This program demonstrates input and output of 4 different data types: int/double/char/string*/
import java.util.Scanner;
    public class ex3a
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
             // Declare 4 variables name, num1, num2 and letter - each a different data type
            int num1;
            double num2;
            char letter;
            String name;

            //Input an integer from the user and output it to the screen
            System.out.println("Please enter an integer number:");
            num1 = sc.nextInt();
            System.out.println("The integer number entered is  "   + num1);
            
            //Input a Double from the user and output it to the screen
            System.out.println("Please enter a number with a decimal point:");
            num2 = sc.nextDouble(); 
            System.out.println("The decimal number entered is  "   + num2);

            //Input a character from the user and output it to the screen
            System.out.println("Please enter a single character:");
            letter = sc.next().charAt(0);
            System.out.println("The single character entered is  "   + letter);

             //Input a String from the user and output it to the screen
            System.out.println("Please enter your name :");
            name = sc.next();   
            System.out.println("The String you entered is  "   + name);

            System.out.println("The End!");
         }
    }
