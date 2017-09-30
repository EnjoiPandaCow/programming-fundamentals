import java.util.Scanner;
    public class ex9g
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int x;
            int b;
            int ans1;
            int ans2;
            
            System.out.println("**** Calculate y = 2x + b / 6 ****");
            
            System.out.println();
            
            System.out.print("Please enter a value for X: ");
            x = sc.nextInt();
            
            System.out.print("Please enter a value for b: ");
            b = sc.nextInt();
            
            ans1 = method1(x);
            ans2 = method2(b);
            
            System.out.println();
            
            System.out.println("2 * " + x + " + " + b + " / 6 equals " + (ans1 + ans2)); 
            
        }
        
        public static int method1(int x)
        {
            return 2*x;
        }
        
        public static int method2(int b)
        {
            return b/6;
        }
    }
