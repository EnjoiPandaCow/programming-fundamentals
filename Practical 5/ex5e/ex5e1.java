//program to tell what grade you get when percentage is entered//
import java.util.Scanner;
    public class ex5e1
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
                
                switch(status)        	
                {                	 
                	case 'S': case 's':		                 			
                		System.out.println("Hi " +name+ " your marital status is that you are single" );	           	break;        	         
                	case 'M': case 'm':	                	 
                		System.out.println("Hi " +name+ " your marital status is that you are married" );	            break;         	         
                	case 'D': case 'd':                 		
                		System.out.println("Hi " +name+ " your marital status is that you are divorced" );                
                		 break;	                
                	// case ‘E’: case ‘e’:			 //break;		                 
                	default:        		         
                		System.out.println("Sorry " +name+ " you entered an invalid response!");                
                } 
        } 
   }
            
            
            
            
            
            
            
            
