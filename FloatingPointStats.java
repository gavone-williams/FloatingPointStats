import java.util.Scanner;

public class FloatingPointStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        final int MAX_INPUTS = 5;
        double total = 0.0;
        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;

        System.out.println("--- Floating-Point Number Analyzer ---");

        // While loop structured to process exactly 5 inputs and prevent an infinite loop
        while (count < MAX_INPUTS) {
            System.out.print("Enter floating-point value " + (count + 1) + " of " + MAX_INPUTS + ": ");

            if (scanner.hasNextDouble()) {
                double currentVal = scanner.nextDouble();

                total += currentVal;

                if (count == 0) {
                    maximum = currentVal;
                    minimum = currentVal;
                } else {
                    if (currentVal > maximum) {
                        maximum = currentVal;
                    }
                    if (currentVal < minimum) {
                        minimum = currentVal;
                    }
                }

                // Increment counter to ensure loop condition eventually becomes false
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // Clear invalid input from scanner buffer
            }
        }

        double average = total / MAX_INPUTS;
        double interest = total * 0.20;

        System.out.println("\n--- Summary Results ---");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", maximum);
        System.out.printf("Minimum: %.2f%n", minimum);
        System.out.printf("Interest on total at 20%%: %.2f%n", interest);

        scanner.close();
    }
}