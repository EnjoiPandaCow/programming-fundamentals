//program that takes in a users age and tells them if they are old enough to drink
import java.util.Scanner;
    public class ex8g
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int age;
            
            System.out.print("Please enter your age: ");
            age = sc.nextInt();
            
            age(age);
        }
        
        public static void age(int a)
        {
          if(a >= 18)
          {
              System.out.print("You can legally drink");
          }
          else
          {
              System.out.print("You are too young to drink");
          }
        }
    }