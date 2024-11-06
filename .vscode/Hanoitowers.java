
import java.util.Scanner;

public class Hanoitowers {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of disks
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        // Solve the Tower of Hanoi problem
        solveHanoi(n, 'A', 'C', 'B'); // A = source, C = destination, B = auxiliary

        // Close the scanner
        scanner.close();
    }

    // Recursive method to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            // Base case: if there's only 1 disk, move it from source to destination
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Recursive case: move n-1 disks from source to auxiliary, using destination as an auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination, using source as an auxiliary
        solveHanoi(n - 1, auxiliary, destination, source);
    }
}
