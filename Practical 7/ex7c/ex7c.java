//program that takes in a persons age and tells them how old they will be next year
import java.util.Scanner;
    public class ex7c
    {
        public static void main(String args[])
        {   
               Scanner sc = new Scanner(System.in);
               
               int age;
              
               System.out.print("Please enter your age: ");
               age = sc.nextInt();
               
               System.out.println();
               
               while(age < 0)
               {
                   System.out.print("Invalid age. Please re-enter your age: ");
                   age = sc.nextInt();
                   System.out.println();
               }
               
               System.out.print("Next year you will be: " + (age + 1));
        }
    }
