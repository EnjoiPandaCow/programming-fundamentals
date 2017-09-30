import java.util.Scanner;
    public class ex9a1
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int a;
            int b;
            int t;
            
            a = 7;
            b = 9;
            t = sum(a,b);
            
            System.out.println("The sum of " + a + " and " + b + " is " + t);
        }
        
        public static int sum(int x, int y)
        {
            int ans;
            
            ans = x + y;
            
            return(ans);
        }
    }    
