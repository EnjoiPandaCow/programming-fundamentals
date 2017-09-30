import java.util.Scanner;
    public class ex9c
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            double pound = 0;
            double kilo;
            double shortKilos;

            System.out.println("*** Pound / Kilogram Converter ***");
            
            System.out.println();
            
            System.out.print("Please enter a pound value: ");
            pound = sc.nextDouble();
            
            kilo = convertKilostoPounds(pound);
            
            shortKilos = Math.round(kilo*100.0)/100.0;
            
            System.out.println( pound + " pounds converted to kilos is " + shortKilos);
        }
        
        public static double convertKilostoPounds(double x)
        {
            double ans;
            
            return x*2.2;

        }
    }
      