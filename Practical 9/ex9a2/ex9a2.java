import java.util.Scanner;

public class ex9a2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a, b;
	
		a = 7;
		b= 9;
		
		System.out.println("The sum of " + a + " and "+ b + " is " + sum(a, b));
	}
	public static int sum(int x, int y)
	{	
		return(x + y);
		
	
	  }
}
