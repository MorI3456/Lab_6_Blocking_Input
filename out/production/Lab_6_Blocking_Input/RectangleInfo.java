import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validInput;

        // Get width
        do {
            System.out.print("Enter width of the rectangle: ");
            validInput = scanner.hasNextDouble();
            if (validInput) {
                width = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
            scanner.nextLine(); // Clear buffer after each input attempt
        } while (!validInput);

        // Reset validInput before starting the second loop
        validInput = false;

        // Get height
        do {
            System.out.print("Enter height of the rectangle: ");
            validInput = scanner.hasNextDouble();
            if (validInput) {
                height = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
            scanner.nextLine(); // Clear buffer after each input attempt
        } while (!validInput);

        // Calculate area, perimeter, and diagonal
        double area = width * height;
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("Area: %.2f\n", area); // %.2f rounds the floating-point number to two decimal places
        System.out.printf("Diagonal: %.2f\n", diagonal);
    }
}
