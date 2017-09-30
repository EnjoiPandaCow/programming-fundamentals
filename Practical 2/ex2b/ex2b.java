//Programm to show an entered name
import java.util.*;
class ex2b
{
 public static void main(String [] args)
 {
     Scanner input = new Scanner(System.in);
     
     String s;
     System.out.print("What's your name?: ");
     s = input.next();
     System.out.print("Greetings " +s);
 }
} 
