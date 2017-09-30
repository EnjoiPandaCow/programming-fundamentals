// This program is used to calculate the age a person will be in 2050
import java.util.Scanner;
    public class ex3d
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
            // Declaring the two variables needed
            int born;
            int age;
            
            System.out.println("Please input the year you were born:");
            born = sc.nextInt();
            
            age = 2050-born;
            
            System.out.println("In 2050, you will be " + age + " years old");
            
        }
    }       