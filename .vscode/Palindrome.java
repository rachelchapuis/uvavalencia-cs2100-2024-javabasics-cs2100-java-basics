import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input to test
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Check if the string is a palindrome w function to match left to roght to right to left
        if (isPalindrome(input)) {
            System.out.println("Your word is a palindrome.");
        } else {
            System.out.println("Your word is NOT a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for uniformity
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Initialize two starting points for reading the word
        int left = 0;
        int right = str.length() - 1;

        // Compare letters from the beginning and the end
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;  // Move forward a letter
            right--; // Move backward a letter
        }

        return true;  // If the loop completes, it's a palindrome because all letters at all indexes were equal
    }
}

