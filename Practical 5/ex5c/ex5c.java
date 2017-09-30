//Program that sees what group a user is in by age
import java.util.Scanner;
    class ex5c
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int age;
            
            System.out.print("Please enter you age: ");
            age = sc.nextInt();
            
            if (age < 14)
                System.out.print("You are in Category A");
                
                else if (age >= 14 && age < 16)
                System.out.print("You are in Category B");
                
                else
                System.out.print("You are in Category C");
        }
    }