import java.util.Scanner;
    public class ex9e
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int x;
            int y;
            int highNum;
            
            System.out.println("**** Find the Largest of 2 Positive Numbers ****");
            
            System.out.println();
            
            System.out.print("Please enter First Number: ");
            x = sc.nextInt();
            
            System.out.print("Please enter Second Number: ");
            y = sc.nextInt();
            
            highNum = largestNum(x, y);
            
            
            System.out.println( highNum + " is the largest of the two numbers " + x + " and " + y);
            
        }
        
       public static int largestNum(int x, int y)
        {   
            int z = 0;
            
            if( x > y)
            {
                return x;
            }
            else
            {
                return y;
            }
            
        }
    }   
