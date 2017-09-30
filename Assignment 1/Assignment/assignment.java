/**
 * This is a system in where the user can enter student details and the system will produce the students statistics and a full transcipt
 * 
 * @author (CJ O'Sullivan - 20058550) 
 * @version (28/10/2014)
 */
//This first line of code imports class's from the java libary. In this program we only use the scanner class
  import java.util.*;
  
//Calling the class assignment   
public class assignment
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner (System.in);
   
   //Giving all the declaring names, setting there data types and initalising them
   int choice;
   int num = 0;
   double mod1 = -1;
   double mod2 = -1;
   double mod3 = -1;
   double mod4 = -1;
   double mod5 = -1;
   double mod6 = -1;
   double highGrade = 0;
   double lowGrade = 0;
   double gpa = 0;
   int passCount = 0;
   int failCount = 0;
   int credits = 0;
   char continueChoice = 'W';
   String award = "X";
   String rank = "Y";
   String name = "Z";
   
  //do while loop shows the menu to the user when the progame starts and will show it again untill the user choses to end the program 
   do{
       //Displaying the menu to the user and asking to enter an option
       System.out.println("Nurse Grade System");
       System.out.println("------------------");
       
       System.out.println();
       
       System.out.println("  1) Enter nurse details");
       System.out.println("  2) Display nurse grades");
       System.out.println("  3) Display nurse statistics");
       System.out.println("  4) Display full transcript");
       System.out.println("  0) Exit system");
       
       System.out.println();
       
       System.out.print("Select an option [0-4] >> ");
       choice = sc.nextInt();
       
       System.out.println();
 
            //The switch statement declares an int named choice whoes value represents each choicec. The code displays the contents of each choice
            switch(choice)
            {
                //Option one -- asks the user to enter the student nurse details
                case 1:
                System.out.println("Enter Nurse Details");
                System.out.println("-------------------");
                
                //The user is asked to enter the students rank here
                System.out.print("   Student Rank:                                           ");
                //The value that was entered by the user is then stored in the variable rank using the next line of code
                rank = sc.nextLine();
                rank = sc.nextLine();
                System.out.print("   Student Number:                                         ");
                num = sc.nextInt();
                System.out.print("   Student Name:                                           ");
                name = sc.nextLine();
                name = sc.nextLine();
                
                //The line bellow prints a blank line
                System.out.println();
               
                //Asking the user to enter the module one grade
                System.out.print("Module 1 - :Management and Leadership:                     ");
                //Storing the value for module one in mod1
                mod1 = sc.nextInt();
                //The while checks if the grade is between 100 - 0 and if not asks the user to enter a grade between 0 - 100 
                while(mod1 > 100 || mod1 < 0)
                {
                    System.out.print("Invalid grade. Please enter a grade between 0-100: ");
                    mod1 = sc.nextDouble();
                }
                System.out.print("Module 2 - :Research Methods:                              ");
                mod2 = sc.nextInt();
                  while(mod2 > 100 || mod2 < 0)
                {
                    System.out.print("Invalid grade. Please enter a grade between 0-100: ");
                    mod1 = sc.nextDouble();
                }
                System.out.print("Module 3 - :Quality and Practise Development:              ");
                mod3 = sc.nextInt();
                  while(mod3 > 100 || mod3 < 0)
                {
                    System.out.print("Invalid grade. Please enter a grade between 0-100: ");
                    mod1 = sc.nextDouble();
                }
                System.out.print("Module 4 - :Legal and Ethical Issues:                      ");
                mod4 = sc.nextInt();
                  while(mod4 > 100 || mod4 < 0)
                {
                    System.out.print("Invalid grade. Please enter a grade between 0-100: ");
                    mod1 = sc.nextDouble();
                }
                System.out.print("Module 5 - :Health Promotion and Primary Health Care:      ");
                mod5 = sc.nextInt();
                  while(mod5 > 100 || mod5 < 0)
                {
                    System.out.print("Invalid grade. Please enter a grade between 0-100: ");
                    mod1 = sc.nextDouble();
                }
                System.out.print("Module 6 - :Nursing Theory and Practice:                   ");
                mod6 = sc.nextInt();
                  while(mod6 > 100 || mod6 < 0)
                {
                    System.out.print("Invalid grade. Please enter a grade between 0-100: ");
                    mod1 = sc.nextDouble();
                }
                
                System.out.println();
                
                //Asks the user would they like to continue
                System.out.print("Would you like to continue? (y/n): ");
                continueChoice = sc.next().charAt(0);
              
                System.out.println();
                System.out.println();
                
                //I decided to do the calculations here because if the user went to option four without going to option three the calculations would already be done
                //These if else statements calculate the pass and fail counters. If the module is grater or equal to 40 it adds one to passCount if not it adds one to failCount
                 if(mod1 >= 40)
                 {
                     passCount++;
                 }
                 else 
                 {
                     failCount++;
                 }
                 
                 if(mod2 >= 40)
                 {
                     passCount++;
                 }
                 else 
                 {
                     failCount++;
                 }
                 
                 if(mod3 >= 40)
                 {
                     passCount++;
                 }
                 else 
                 {
                     failCount++;
                 }
                 
                 if(mod4 >= 40)
                 {
                     passCount++;
                 }
                 else 
                 {
                     failCount++;
                 }
                 
                 if(mod5 >= 40)
                 {
                     passCount++;
                 }  
                 else 
                 {
                     failCount++;
                 }
                 
                 if(mod6 >= 40)
                 {
                     passCount++;
                 }
                 else 
                 {
                     failCount++;
                 }
               
                 
                 //Below we are calculating which of the modules is the highest grade buy seeing if one is grater than the other five
                 if (mod1 >= mod2 && mod1 >= mod3 && mod1 >= mod4 && mod1 >= mod5 && mod1 >= mod6) 
                 {
                     highGrade = mod1;
                 }
                 
                 if (mod2 >= mod1 && mod2 >= mod3 && mod2 >= mod4 && mod2 >= mod5 && mod2 >= mod6)
                 {
                     highGrade = mod2;
                 }
                 
                 if (mod3 >= mod1 && mod3 >= mod2 && mod3 >= mod4 && mod3 >= mod5 && mod3 >= mod6) 
                 {
                     highGrade = mod3;
                 }
                 
                 if (mod4 >= mod1 && mod4 >= mod2 && mod4 >= mod3 && mod4 >= mod5 && mod4 >= mod6) 
                 {
                     highGrade = mod4;
                 }
                 
                 if (mod5 >= mod1 && mod5 >= mod2 && mod5 >= mod3 && mod5 >= mod4 && mod5 >= mod6) 
                 {
                     highGrade = mod5;
                 }
                 
                 if (mod6 >= mod1 && mod6 >= mod2 && mod6 >= mod3 && mod6 >= mod4 && mod6 >= mod5) 
                 {
                     highGrade = mod6;
                 }
                 
                 
                 //Below we are calculating which of the modules is the lowest grade buy seeing if one is lower than the other five
                   if (mod1 < mod2 && mod1 < mod3 && mod1 < mod4 && mod1 < mod5 && mod1 < mod6) 
                 {
                     lowGrade = mod1;
                 }
                 
                 if (mod2 <= mod1 && mod2 <= mod3 && mod2 <= mod4 && mod2 <= mod5 && mod2 <= mod6) 
                 {
                     lowGrade = mod2;
                 }
                 
                 if (mod3 <= mod1 && mod3 <= mod2 && mod3 <= mod4 && mod3 <= mod5 && mod3 <= mod6) 
                 {
                     lowGrade = mod3;
                 }
                 
                 if (mod4 <= mod1 && mod4 <= mod2 && mod4 <= mod3 && mod4 <= mod5 && mod4 <= mod6) 
                 {
                     lowGrade = mod4;
                 }
                 
                 if (mod5 <= mod1 && mod5 <= mod2 && mod5 <= mod3 && mod5 <= mod4 && mod5 <= mod6) 
                 {
                     lowGrade = mod5;
                 }
                 
                 if (mod6 <= mod1 && mod6 <= mod2 && mod6 <= mod3 && mod6 <= mod4 && mod6 <= mod5) 
                 {
                     lowGrade = mod6;
                 }
                
                 //Calculating the credits is done by taking the passCount and multiplying it by five
                 credits = passCount*5;
                 
                 //GPA is calculated by adding all the modules and dividing the answer by six
                 gpa = (mod1 + mod2 + mod3 + mod4 + mod5 + mod6) / 6; 
                 
                 //Award is calculated by seeing if the gpa of the student is grater that the specified percentage for each a   
                 if(gpa < 40)
                 {
                     award = "Fail";
                 }
                 
                 if(gpa >= 40 && gpa <= 49)
                 {
                     award = "Pass";
                 }
                 
                 if(gpa >= 50 && gpa <= 59)
                 {
                     award = "2.2 honors";
                 }
                 
                 if(gpa >= 60 && gpa <= 69)
                 {
                     award = "2.1 honors";
                 }
                 
                 if (gpa > 70)
                 {
                     award = "1st class honors";
                 }
             
                 //break ends each case
                 break;
                 
                 //Option No.2 -- Displaying student grades
                 case 2: 
                //This if statement checks to see if the user has entered any detils or has gone stright to option 2 without enterting details
                if(rank == "Y" && name == "Z" && num == 0 && mod1 == -1 && mod2 == -1 && mod3 == -1 && mod4 == -1 && mod5 == -1 && mod6 == -1)
                 {
                     System.out.println("No nurse details entered. Please enter the nurse details via option 1");
                     
                     System.out.println();
                 
                     System.out.print("Would you like to continue? (y/n): ");
                     continueChoice = sc.next().charAt(0);

                     System.out.println();
                     System.out.println();
                 }
                 else
                 {
                 //This option is taking in the information entered in by the user and displaying it to the screen
                 System.out.println(" Student (Rank): " + rank);
                 System.out.println(" Student (Number): " + name + " " + num);
                 
                 System.out.println();
                 
                 System.out.println("Semester 1 Results");
                 System.out.println("------------------");
                 
                 System.out.println("Module 1 - :Management and Leadership: " + mod1);
                 System.out.println("Module 2 - :Research Methods: " + mod2);
                 System.out.println("Module 3 - :Quality and Practise Development: " + mod3);
                 System.out.println("Module 4 - :Legal and Ethical Issues: " + mod4);
                 System.out.println("Module 5 - :Health Promotion and Primary Health Care: " + mod5);
                 System.out.println("Module 6 - :Nursing Theory and Practice: " + mod6);
                 
                 System.out.println();
                 
                 System.out.print("Would you like to continue? (y/n): ");
                 continueChoice = sc.next().charAt(0);

                 System.out.println();
                 System.out.println();
                }
                 break;
                 
                 //Option 3 -- Displaying student stats
                 case 3: 
                 //This if statement checks to see if the user has entered any detils or has gone stright to option 2 without enterting details
                 if(rank == "Y" && name == "Z" && num == 0 && mod1 == -1 && mod2 == -1 && mod3 == -1 && mod4 == -1 && mod5 == -1 && mod6 == -1)
                 {
                     System.out.println("No nurse details entered. Please enter the nurse details via option 1");
                     
                     System.out.println();
                 
                     System.out.print("Would you like to continue? (y/n): ");
                     continueChoice = sc.next().charAt(0);

                     System.out.println();
                     System.out.println();
                 }
                 else
                 {
                 //This option is taking th calculations that we did in case 1 and then printing them to the screen
                 System.out.println(" Student (Rank): " + rank);
                 System.out.println(" Student (Number): " + name + num);
                 
                 System.out.println();
                 
                 System.out.println("   Semester 1 statistics");
                 System.out.println("   ~~~~~~~~~~~~~~~~~~~~~");
                 System.out.println("     Number of passed modules: " + passCount);
                 System.out.println("     Number of failed modules: " + failCount);
                 System.out.println("     Highest grade: " + highGrade);
                 System.out.println("     Lowest grade: " + lowGrade);
                 System.out.println("     Credits achieved (max 30): " + credits);
                 System.out.println("     Your GPA is: " + gpa);
                 System.out.println("     Your award is: " + award);
                 
                 System.out.println();
                 
                 System.out.print("Would you like to continue? (y/n): ");
                 continueChoice = sc.next().charAt(0);

                 System.out.println();
                 System.out.println();
                }
                 break;
                 
                 //Option 4 -- Displaying full transcript
                 case 4:
                //This if statement checks to see if the user has entered any detils or has gone stright to option 2 without enterting details
                 if(rank == "Y" && name == "Z" && num == 0 && mod1 == -1 && mod2 == -1 && mod3 == -1 && mod4 == -1 && mod5 == -1 && mod6 == -1)
                 {
                     System.out.println("No nurse details entered. Please enter the nurse details via option 1");
                     
                     System.out.println();
                 
                     System.out.print("Would you like to continue? (y/n): ");
                     continueChoice = sc.next().charAt(0);

                     System.out.println();
                     System.out.println();
                 }
                 else
                 {
                 //This option prints the students grades and statistics to the screen as one full transcript
                 System.out.println("=========================================================================================");
                 System.out.println("                           Royal College of Surgeons in Ireland,");
                 System.out.println("                               123, St. Stephens Green,");
                 System.out.println("                                    Dublin 2");
                 System.out.println("                                    Ireland");
                 
                 System.out.println();
                 
                 System.out.println("                                  t: (01) 402 2100");
                 System.out.println("                                  w: www.rcsi.ie");
                 System.out.println("                                  e: info@rcsi.ie");
                 
                 System.out.println();
                 
                 System.out.println("Student (Rank): " + rank);
                 
                 System.out.println();
                 
                 System.out.println("Student(number):" + name + "(" + num + ")");
                 
                 System.out.println();
                 
                 System.out.println("   Semester 1 results");
                 System.out.println("   ~~~~~~~~~~~~~~~~~~");
                 System.out.println("     Module 1 - :Management and Leadership: " + mod1);
                 System.out.println("     Module 2 - :Research Methods: " + mod2);
                 System.out.println("     Module 3 - :Quality and Practise Development: " + mod3);
                 System.out.println("     Module 4 - :Legal and Ethical Issues: " + mod4);
                 System.out.println("     Module 5 - :Health Promotion and Primary Health Care: " + mod5);
                 System.out.println("     Module 6 - :Nursing Theory and Practice: " + mod6);
                 
                 System.out.println();
                 
                 System.out.println("   Semester 1 statistics");
                 System.out.println("   ~~~~~~~~~~~~~~~~~~~~~");
                 System.out.println("     Number of passed modules: " + passCount);
                 System.out.println("     Number of failed modules: " + failCount);
                 System.out.println("     Highest grade: " + highGrade);
                 System.out.println("     Lowest grade: " + lowGrade);
                 System.out.println("     Credits achieved (max 30): " + credits);
                 System.out.println("     Your GPA is: " + gpa);
                 System.out.println("     Your award is: " + award);
                 
                 
                 System.out.println();
                 
                 System.out.print("Would you like to continue? (y/n): ");
                 continueChoice = sc.next().charAt(0);
               
                 System.out.println();
                 System.out.println();
                }
                 break;
                 
                 default: 
                
                 continueChoice = 'n';
                
                 break;
            }
                
       //while choice is y or Y the program will continue other wise it will display the next system.out.print statement
  }   while(continueChoice == 'Y' || continueChoice == 'y');
     System.out.println("Thank you for using the system");
 }
}
   