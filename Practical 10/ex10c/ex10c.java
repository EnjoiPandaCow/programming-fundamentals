import java.util.Scanner;
public class ex10c
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
       
       int[] f = new int[5];
       
        acceptValues(f, sc);
        
        printArray(f);  
        
        System.out.println();
    }

        public static int[] acceptValues(int [] f, Scanner sc) 
    {
        for(int i = 0; i < 5; i = i +1)
        {
          System.out.print("Enter value: ");
          f[i] = sc.nextInt();
          System.out.println();
        }
        
        return f;
    }
    
    public static void printArray(int [] ar)
    {
       int i;
       System.out.println("The values entered are:   ");
       for( i = 0; i < ar.length; i = i + 1)
       {
         System.out.println(ar[i]);
       }
    }
}
       