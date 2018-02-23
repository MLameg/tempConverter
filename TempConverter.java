import java.util.Scanner;

public class TempConverter
{

   public static void main(String[] args)
   {
      int Fahrenheit;
      double Celsius, temp;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Temperature in Degrees Fahrenheit:");
      Fahrenheit = scan.nextInt();
      
      temp = (5.0/9.0) * (Fahrenheit - 32);
      
      System.out.println( + Fahrenheit + "°F is equal to " + temp + "°C.");
      
      
      
    }
}