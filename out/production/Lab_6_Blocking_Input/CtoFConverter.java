import java.util.Scanner;

public class CtoFConverter {
   public CtoFConverter() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double celsius = 0; // This holds the celsius variable, its set to zero 
      boolean validInput = false; //

      do { // The code inside the loop will keep executing until the condition at the bottom of the loop 
         System.out.print("Enter temperature in Celsius: ");
         if (scanner.hasNextDouble()) {
            celsius = scanner.nextDouble();
            validInput = true;
         } else {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
         }
      } while(!validInput);// The ! is used to make the loop continue running while the input isnt valid

      double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
      System.out.println("Temperature in Fahrenheit: " + fahrenheit);
   }
}


