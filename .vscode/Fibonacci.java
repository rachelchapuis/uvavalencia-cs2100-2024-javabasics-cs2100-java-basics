import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Created scanner object to process user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = scanner.nextInt();

        // Call the fibonacci method and display the result
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));

        // Close the scanner
        scanner.close();
    }

    // Recursive function to calculate Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }
}
