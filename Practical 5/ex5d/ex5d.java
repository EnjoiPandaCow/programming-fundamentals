//program to tell what grade you get when percentage is entered
import java.util.Scanner;
    public class ex5d
    {
        public static void main(String args[])
          {   
            Scanner sc = new Scanner(System.in);
            int mark;
            
            System.out.print("Enter your percentage mark= ");
            mark=sc.nextInt();
            
            if (mark >= 0 && mark <= 49)
            System.out.print("Fail");
            
            else if (mark >= 50 && mark <= 64)
            System.out.print("Pass");
            
            else if (mark >= 65 && mark <= 79)
            System.out.print ("Merit");
            
            else if (mark >= 80 && mark <= 100)
            System.out.print("Distinction");
            
            else 
            System.out.print("Invalid mark");
        }
    }