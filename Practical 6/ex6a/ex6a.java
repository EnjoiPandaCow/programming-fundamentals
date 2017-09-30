//program that prints my name to the screen 100 times
import java.util.Scanner;
    public class ex6a
    {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                
                int x;
                String name = "CJ O'Sullivan";
                
                for( x=1; x<=100; x = x+1)
                {
                    System.out.println(name);
                }
        }
    }