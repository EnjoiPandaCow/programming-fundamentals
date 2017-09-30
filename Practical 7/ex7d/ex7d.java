//Asks a user for student information and then prints it to the screen, using a do while loop
import java.util.Scanner;
    public class ex7d
    {
        public static void main(String args[])
        {   
               Scanner sc = new Scanner(System.in);
               
               char reply;
               int courseYr;
               String name;
               String stuNum;
               
               
               do{
                   System.out.println("Enter name:");
                   name = sc.nextLine();
                   
                   System.out.println("Enter student number");
                   stuNum = sc.nextLine();
                   
                   System.out.println("Enter year of course");
                   courseYr = sc.nextInt();
           
                   System.out.println();
                   
                   System.out.println("Name:           " + name);
                   System.out.println("Student Number: " + stuNum);
                   System.out.println("Course Year:    " + courseYr);
                   
                   System.out.print("Enter another student record y/n:  ");
                   reply = sc.next().charAt(0);
                   System.out.println();
                   
                   
                }while(reply == 'y' || reply == 'Y');
                
                
                
               
        }
    }


