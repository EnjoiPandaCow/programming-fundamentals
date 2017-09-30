//program to tell what grade you get when percentage is entered//
import java.util.Scanner;
    public class ex5e2
   {
        public static void main(String args[])
        {   
                Scanner sc = new Scanner(System.in);
                String name;
                char status;
                
                System.out.println("***** Marital Status*****");
                System.out.println("* Single (S, s) " );
                System.out.println("* Married (M, m) " );
                System.out.println("* Divorced (D, d) " );
                System.out.println("* In a Relationship (R, r) " );
                // System.out.println("* Exit (E,e)");  
                
                
                System.out.print("Please enter your name: ");
                name = sc.nextLine();
                
                System.out.print("Please enter your martial status: (s, m, r or d) ");
                status = sc.next().charAt(0);
                
            if(status == 'S' || status == 's')        	
               {                	              			
                      System.out.println("Hi " +name+ " your marital status is that you are single" );	           		
               }         
            else if(status == 'M' || status == 'm') 	  
               {                	 
                      System.out.println("Hi " +name+ " your marital status is that you are married" );	 	         
               }  
            else if(status == 'D' || status == 'd') 			
               {
                     System.out.println("Hi " +name+ " your marital status is that you are divorced" );                
               }
            else	                 
               {		         
                     System.out.println("Sorry " +name+ " you entered an invalid response!");                
               }
        }
    }
            