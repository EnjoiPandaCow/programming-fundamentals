import java.util.*;
public class ex10e
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int[] ages = new int [3];
        
        acceptAges(ages, sc);
        
        averageAge(ages);
        
        System.out.println();
    }
        
    public static int[] acceptAges(int [] ages, Scanner sc)
    {
        for (int i = 0; i < ages.length; i = i + 1)
        {
            System.out.print("Please enter student age: ");
            ages[i] = sc.nextInt();
        }
        
        return ages;
    }
    
    public static void averageAge (int [] agesIn)
    {
        double total=0, average;
        for(int j = 0; j <agesIn.length; j = j + 1)
        {
            total = total + agesIn[j];
        }
        average = total / agesIn.length;
        System.out.println("The average age of students is:  " + average);
    }
}
        
        
        
        
        