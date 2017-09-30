import java.util.Scanner;
    public class ex9d
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int choice;
            double pound = 0;
            double kilo;
            double shortKilo;
            double shortPound;
            char continueChoice = 'X';
            
            do{
                System.out.println("**** Kilogram & Pound Converter ****");
                
                System.out.println();
                
                System.out.println("****Select which you would like to convert:");
                System.out.println("****[1] Kilogram to Pound: ");
                System.out.println("****[2] Pound to Kilogram: ");
                
                System.out.println();
                
                System.out.print("Select an option 1 or 2: ");
                choice = sc.nextInt();
                
                System.out.println();
                
                switch(choice)
                {
                    case 1:

                    System.out.println("*** Pound / Kilogram Converter ***");
            
                    System.out.println();
            
                    System.out.print("Please enter a pound value: ");
                    pound = sc.nextDouble();
                    
                    kilo = convertKilostoPounds(pound);
                    
                    shortKilo = Math.round(kilo*100.0)/100.0;
                    
                    System.out.println( pound + " pounds converted to kilos is " + shortKilo);
                    
                    System.out.println();
                 
                    System.out.print("Would you like to continue? (y/n): ");
                    continueChoice = sc.next().charAt(0);
                   
                    System.out.println();
                    System.out.println();
                    break;
                    
                    case 2:
        
                    System.out.println("*** Kilogram / Pound Converter ***");
                    
                    System.out.println();
                    
                    System.out.print("Please enter a pound value: ");
                    kilo = sc.nextDouble();
                    
                    pound = convertPoundstoKilos(kilo);
                    
                    shortPound = Math.round(pound*100.0)/100.0;
                    
                    System.out.println( kilo + " pounds converted to kilos is " + shortPound);
                    
                    System.out.println();
                 
                    System.out.print("Would you like to continue? (y/n): ");
                    continueChoice = sc.next().charAt(0);
                   
                    System.out.println();
                    System.out.println();
                    break;
                }
            }while(continueChoice == 'Y' || continueChoice == 'y');
        }   
        
        public static double convertKilostoPounds(double x)
        {
            double ans;
            
            return x*2.2;

        }
        
        public static double convertPoundstoKilos(double x)
        {
            double ans;
            
            return x/2.2;

        }
        
    }
    
