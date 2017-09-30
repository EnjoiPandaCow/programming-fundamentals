import java.util.Scanner;
    public class ex9f
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int y;
            int ans1;
            int ans2;
            
            System.out.println("**** Calculate x = y2 - y - 2 ****");
            
            System.out.println();
            
            System.out.print("Please enter a value for Y: ");
            y = sc.nextInt();
            
            ans1 = method1(y);
            ans2 = method2(y);
            
            System.out.println();
            
            System.out.println(y + " squared - ( " + y + " - 2 ) equals " + (ans1 - ans2));
            
            
            
            
        }
        
        public static int method1(int y)
        {
            return y*y;
        }
        
        public static int method2(int y)
        {
            return y-2;
        }
    }