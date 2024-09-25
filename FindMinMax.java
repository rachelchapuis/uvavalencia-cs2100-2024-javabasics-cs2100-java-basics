import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the amount of numbers in your array: ");
        int n = scanner.nextInt();
        
    
        int[] array = new int[n];

    
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Displaying the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    
        scanner.close();
    }
}