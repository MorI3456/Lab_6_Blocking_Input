import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        boolean validInput;

        // Get gallons in tank
        do {
            System.out.print("Enter gallons of gas in tank: ");
            validInput = scanner.hasNextDouble();
            if (validInput) {
                gallons = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
        } while (!validInput);

        // Get fuel efficiency
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            validInput = scanner.hasNextDouble();
            if (validInput) {
                mpg = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
        } while (!validInput);

        // Get price per gallon
        do {
            System.out.print("Enter price of gas per gallon: ");
            validInput = scanner.hasNextDouble();
            if (validInput) {
                pricePerGallon = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
        } while (!validInput);

        // Calculate cost for 100 miles and distance with full tank
        double costFor100Miles = 100 / mpg * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f\n", costFor100Miles);
        System.out.printf("Maximum distance with full tank: %.2f miles\n", maxDistance);
    }
}
