//ASSIGNMENT 3

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");


        try {
        
                int num = scanner.nextInt();

                long factorial = 1;

                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }


                System.out.println(+ num +  " factorial is "  + factorial);


        } catch (Exception e) {
            System.out.println("Input invalid, try again: ");
        }
        scanner.close();
    }
}
