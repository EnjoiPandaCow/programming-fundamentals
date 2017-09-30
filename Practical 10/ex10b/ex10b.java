import java.util.Scanner;
public class ex10b
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
       
       int [] num = new int [5];
       
       for(int i = 0; i < 5; i = i+1)
       {
          System.out.print("Please enter a number: ");
          num[i] = sc.nextInt();
       }
       
       for(int j = 0; j < num.length; j = j+1)
       {
           System.out.println(num[j]);
       }
    }
}
    