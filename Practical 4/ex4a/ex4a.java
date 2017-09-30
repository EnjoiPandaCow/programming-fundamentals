// Ask the user about the waether, advise them to wear a t-shirt or take out a coat
import java.util.Scanner;
    public class ex4a
    {
        public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
            
            String goodWeather;
            
            //What's the weather like?
            System.out.print("Is the weather good today (y/n): ");
            goodWeather = sc.next();
            
            if(goodWeather.equals("y"))
            
                System.out.print("Wear a t-shirt.");
                
                else
                
                System.out.print("Wear a coat.");
    
        }
    }