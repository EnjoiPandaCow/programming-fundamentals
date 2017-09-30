import java.util.Scanner;
    public class ex9h
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            double num1, num2;
            int choice;
            char continueChoice = 'W';
            
            
            do{
                System.out.println("**** Calculator ****");
                System.out.println("First, please enter 2 numbers.");
                
                System.out.println();
                
                System.out.print("Enter First Number: ");
                num1 = sc.nextDouble();
                
                
                System.out.println();
                
                System.out.print("Enter Second Number: ");
                num2 = sc.nextDouble();
                
                System.out.println();
                
                System.out.println("**** Select which function you would like to avail of:");
                System.out.println("**** [1] Add 2 Numbers");
                System.out.println("**** [2] Subtract 2 Numbers");
                System.out.println("**** [3] Multiply 2 Numbers");
                System.out.println("**** [4] Dividde 2 Numbers");
                System.out.print("****   ");
                choice = sc.nextInt();
                
                System.out.println();
                
                    switch(choice)
                    {
                        case 1:
                        
                        System.out.println(num1 + " plus " + num2 + " equals " + add(num1, num2));
                        
                        System.out.println();
                     
                        System.out.print("Would you like to continue? (y/n): ");
                        continueChoice = sc.next().charAt(0);
        
                        System.out.println();
                        System.out.println();
                        break;
                        
                        case 2:
                        
                        System.out.println(num1 + " subtracted from " + num2 + " equals " + sub(num1, num2));
                        
                        System.out.println();
                     
                        System.out.print("Would you like to continue? (y/n): ");
                        continueChoice = sc.next().charAt(0);
        
                        System.out.println();
                        System.out.println();
                        break;
                        
                        
                        
                        case 3:
                        
                        System.out.println(num1 + " multiplied by " + num2 + " equals " + mul(num1, num2));
                        
                        System.out.println();
                     
                        System.out.print("Would you like to continue? (y/n): ");
                        continueChoice = sc.next().charAt(0);
        
                        System.out.println();
                        System.out.println();
                        break;
                        
                        case 4:
                        
                        System.out.println(num1 + " divided by " + num2 + " equals " + div(num1, num2));
                        
                        System.out.println();
                     
                        System.out.print("Would you like to continue? (y/n): ");
                        continueChoice = sc.next().charAt(0);
        
                        System.out.println();
                        System.out.println();
                        break;
                        
                        default:
                        
                        continueChoice = 'n';
                        break;
                }
               }while(continueChoice == 'Y' || continueChoice == 'y');
            }
        public static double add(double num1, double num2)
        {
            return num1 + num2;
        }
        
        public static double sub(double num1, double num2)
        {
            return num1 - num2;
        }
        
        public static double mul(double num1, double num2)
        {
            return num1 * num2;
        }
        
        public static double div(double num1, double num2)
        {
            return num1 / num2;
        }
}