//ASSIGNMNET 4
public class PrimeNumber {

    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("Enter number to check if prime");
            return;
        }

      
        int number = Integer.parseInt(args[0]);

      
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

 
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
