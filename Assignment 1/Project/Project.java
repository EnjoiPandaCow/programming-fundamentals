/**
 * Write a description of class Project here.
 * 
 * @author (CJ O'Sullivan - 20058550) 
 * @version (30/10/2012)
 */
 import java.util.*;
 
 public class Project
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner (System.in);
    
   int choice;
   int studentNumber = 0;
   int programmingGrade = 0;
   int webDevelopmentGrade = 0;
   int mathematicsGrade = 0;
   int criticalThinkingGrade = 0;
   int operatingSystemsGrade = 0;
   int computerArchitectureGrade = 0;
   int passCounter = 0;
   int failCounter = 0;
   int highestGrade = 0;
   int lowestGrade = 0;
   int credits = 0;
   int gpa = 0; 
   int average = 0;
   char continueChoice = 'Y';
   String studentName = "Z";
   String award = "X";
   
   do{   
   System.out.println("Student Grade System");
   System.out.println("--------------------");
   
   System.out.println();
   
   System.out.println("  1) Enter student details");
   System.out.println("  2) Display student grades");
   System.out.println("  3) Display student statistics");
   System.out.println("  4) Display full transcript");
   System.out.println("  0) Exit system");
   
   System.out.println();
   
   System.out.print("Select an option [0-4] >> ");
   choice = sc.nextInt();
   
   
     switch(choice)
     {   
         case 1:
         System.out.println("Entering Student Details");
         System.out.println("------------------------");
         System.out.print("   Student name:                ");
         studentName = sc.nextLine();
         studentName = sc.nextLine();
         System.out.print("   Student Number:              ");
         studentNumber = sc.nextInt();
         System.out.print("   Programming Grade:           ");
         programmingGrade = sc.nextInt();
         System.out.print("   Web development Grade:       ");
         webDevelopmentGrade = sc.nextInt();
         System.out.print("   Mathematics Grade:           ");
         mathematicsGrade = sc.nextInt();
         System.out.print("   Critical Thinking Grade:     ");
         criticalThinkingGrade = sc.nextInt();
         System.out.print("   Operating Systems Grade:     ");
         operatingSystemsGrade = sc.nextInt();
         System.out.print("   Computer Architecture Grade: ");
         computerArchitectureGrade = sc.nextInt();
         
         System.out.println();
         
         System.out.print("Would you like to continue? (y/n): ");
         continueChoice = sc.next().charAt(0);
         break;
         
         case 2:
         System.out.println("   Semester 1 results");
         System.out.println("   ~~~~~~~~~~~~~~~~~~");
         System.out.println("     Programming: " + programmingGrade);
         System.out.println("     Web Development: " + webDevelopmentGrade);
         System.out.println("     Mathematics: " + mathematicsGrade);
         System.out.println("     Critical Thinking: " + criticalThinkingGrade);
         System.out.println("     Operating Systems: " + operatingSystemsGrade);
         System.out.println("     Computer Architecture: " + computerArchitectureGrade);
         
         System.out.println();
         
         System.out.print("Would you like to continue? (y/n): ");
         continueChoice = sc.next().charAt(0);
         break;
         
         case 3:
          if(programmingGrade >= 40)
         {
             passCounter++;
         }
         
         if(webDevelopmentGrade >= 40)
         {
             passCounter++;
         }
         
         if(mathematicsGrade >= 40)
         {
             passCounter++;
         }
         
         if(criticalThinkingGrade >= 40)
         {
             passCounter++;
         }
         
         if(operatingSystemsGrade >= 40)
         {
             passCounter++;
         }   
         
         if(computerArchitectureGrade >= 40)
         {
             passCounter++;
         }
         
         
           if(programmingGrade <= 40)
         {
             failCounter++;
         }
         
         if(webDevelopmentGrade <= 40)
         {
             failCounter++;
         }
         
         if(mathematicsGrade <= 40)
         {
             failCounter++;
         }
         
         if(criticalThinkingGrade <= 40)
         {
             failCounter++;
         }
         
         if(operatingSystemsGrade <= 40)
         {
             failCounter++;
         }   
         
         if(computerArchitectureGrade <= 40)
         {
             failCounter++;
         }
         
         
        
         if(programmingGrade > webDevelopmentGrade && programmingGrade > mathematicsGrade && programmingGrade > criticalThinkingGrade && programmingGrade > operatingSystemsGrade && programmingGrade > computerArchitectureGrade)
         {
             highestGrade = programmingGrade;
         }
             
         if(webDevelopmentGrade > programmingGrade && webDevelopmentGrade > mathematicsGrade && webDevelopmentGrade > criticalThinkingGrade && webDevelopmentGrade > operatingSystemsGrade && webDevelopmentGrade > computerArchitectureGrade)
         {
             highestGrade = webDevelopmentGrade;
         }
         
         if(mathematicsGrade > programmingGrade && mathematicsGrade > webDevelopmentGrade  && mathematicsGrade > criticalThinkingGrade && mathematicsGrade > operatingSystemsGrade && mathematicsGrade > computerArchitectureGrade)
         {
             highestGrade = mathematicsGrade ;
         }
         
         if(criticalThinkingGrade > programmingGrade && criticalThinkingGrade > webDevelopmentGrade  && criticalThinkingGrade > mathematicsGrade && criticalThinkingGrade > operatingSystemsGrade && criticalThinkingGrade > computerArchitectureGrade)
         {
             highestGrade = criticalThinkingGrade ;
         }
         
         if(operatingSystemsGrade > programmingGrade && operatingSystemsGrade > webDevelopmentGrade  && operatingSystemsGrade > mathematicsGrade && operatingSystemsGrade > criticalThinkingGrade && operatingSystemsGrade > computerArchitectureGrade)
         {
             highestGrade = operatingSystemsGrade ;
         }
         
          if(computerArchitectureGrade > programmingGrade && computerArchitectureGrade > webDevelopmentGrade  && computerArchitectureGrade > mathematicsGrade && computerArchitectureGrade > criticalThinkingGrade && computerArchitectureGrade > operatingSystemsGrade     )
         {
             highestGrade = computerArchitectureGrade ;
         }
         
         
        
          if(programmingGrade < webDevelopmentGrade && programmingGrade < mathematicsGrade && programmingGrade < criticalThinkingGrade && programmingGrade < operatingSystemsGrade && programmingGrade < computerArchitectureGrade)
         {
             lowestGrade = programmingGrade;
         }
             
         if(webDevelopmentGrade < programmingGrade && webDevelopmentGrade < mathematicsGrade && webDevelopmentGrade < criticalThinkingGrade && webDevelopmentGrade < operatingSystemsGrade && webDevelopmentGrade < computerArchitectureGrade)
         {
             lowestGrade = webDevelopmentGrade;
         }
         
         if(mathematicsGrade < programmingGrade && mathematicsGrade < webDevelopmentGrade  && mathematicsGrade < criticalThinkingGrade && mathematicsGrade < operatingSystemsGrade && mathematicsGrade < computerArchitectureGrade)
         {
             lowestGrade = mathematicsGrade ;
         }
         
         if(criticalThinkingGrade < programmingGrade && criticalThinkingGrade < webDevelopmentGrade  && criticalThinkingGrade < mathematicsGrade && criticalThinkingGrade < operatingSystemsGrade && criticalThinkingGrade < computerArchitectureGrade)
         {
             lowestGrade = criticalThinkingGrade ;
         }
         
         if(operatingSystemsGrade < programmingGrade && operatingSystemsGrade < webDevelopmentGrade  && operatingSystemsGrade < mathematicsGrade && operatingSystemsGrade < criticalThinkingGrade && operatingSystemsGrade < computerArchitectureGrade)
         {
             lowestGrade = operatingSystemsGrade ;
         }
         
          if(computerArchitectureGrade < programmingGrade && computerArchitectureGrade < webDevelopmentGrade  && computerArchitectureGrade < mathematicsGrade && computerArchitectureGrade < criticalThinkingGrade && computerArchitectureGrade < operatingSystemsGrade)
         {
             lowestGrade = computerArchitectureGrade ;
         }
         
        
         credits = passCounter*5;
        
         gpa = programmingGrade + webDevelopmentGrade + mathematicsGrade + criticalThinkingGrade + operatingSystemsGrade + computerArchitectureGrade;
         average = gpa/6;
         
         
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
         
         
         System.out.println("   Semester 1 statistics");
         System.out.println("   ~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("     Number of passed modules: " + passCounter);
         System.out.println("     Number of failed modules: " + failCounter);
         System.out.println("     Highest grade: " + highestGrade);
         System.out.println("     Lowest grade: " + lowestGrade);
         System.out.println("     Credits achieved (max 30): " + credits);
         System.out.println("     Your GPA is: " + average);
         System.out.println("     Your award is: " + award);
         
         System.out.println();
         
         System.out.print("Would you like to continue? (y/n): ");
         continueChoice = sc.next().charAt(0);
         break;
         
         
         
         case 4:
         
         System.out.println("                           Waterford Institue of Technology,");
         System.out.println("                            Cork Road,");
         System.out.println("                             Waterford.");
         
         System.out.println();
         
         System.out.println("                          t: (051) 302000");
         System.out.println("                          w: www.wit.ie");
         System.out.println("                          e: info@wit.ie");
         
         System.out.println();
         
         System.out.println("Student(number):" + studentName + studentNumber);
         
         System.out.println("   Semester 1 results");
         System.out.println("   ~~~~~~~~~~~~~~~~~~");
         System.out.println("     Programming: " + programmingGrade);
         System.out.println("     Web Development: " + webDevelopmentGrade);
         System.out.println("     Mathematics: " + mathematicsGrade);
         System.out.println("     Critical Thinking: " + criticalThinkingGrade);
         System.out.println("     Operating Systems: " + operatingSystemsGrade);
         System.out.println("     Computer Architecture: " + computerArchitectureGrade);
         
         System.out.println();
         
         System.out.println("   Semester 1 statistics");
         System.out.println("   ~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("     Number of passed modules: " + passCounter);
         System.out.println("     Number of failed modules: " + failCounter);
         System.out.println("     Highest grade: " + highestGrade);
         System.out.println("     Lowest grade: " + lowestGrade);
         System.out.println("     Credits achieved (max 30): " + credits);
         System.out.println("     Your GPA is: " + gpa);
         System.out.println("     Your award is: " + award);
         
         
         System.out.println();
         
         System.out.print("Would you like to continue? (y/n): ");
         continueChoice = sc.next().charAt(0);
         break;
         
         default: 
         continueChoice ='N';
         break;
         
         
     }
     }while(continueChoice == 'Y' || continueChoice == 'y');
     System.out.println("Thank you for using the system");
 }
}

