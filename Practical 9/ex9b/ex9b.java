import java.util.Scanner;
    public class ex9b
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            double kilo = 0;
            double pound;
            double shortPound;

            System.out.println("*** Kilogram / Pound Converter ***");
            
            System.out.println();
            
            System.out.print("Please enter a pound value: ");
            kilo = sc.nextDouble();
            
            pound = convertPoundstoKilos(kilo);
            
            shortPound = Math.round(pound*100.0)/100.0;
            
            System.out.println( kilo + " pounds converted to kilos is " + shortPound);
        }
        
        public static double convertPoundstoKilos(double x)
        {
            double ans;
            
            return x/2.2;

        }
    }
    
                     
