import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        // Factorial is not defined for negative numbers
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            // Use 'long' to prevent overflow for numbers up to 20
            long factorial = 1; 
            
            // Loop from 1 up to the given number
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiplies: factorial = factorial * i
            }
            
            // Display the final result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        // Close the scanner object
        scanner.close();
    }
}
