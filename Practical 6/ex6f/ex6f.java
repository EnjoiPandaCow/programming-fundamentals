//program that prints the even numbers from 1-20
import java.util.Scanner;
    public class ex6f
    {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                
                for(int i = 1; i <=20; i++)
            	{
            		if(i%2 == 0)
            		{
            			System.out.print(i + "\t");
            		}
            	}

        }
    }    
