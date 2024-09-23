public class SumOfInts {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (args.length != 1) {
            System.out.println("Enter target sum: ");
            return;
        }

        int targetSum = Integer.parseInt(args[0]);

        
        boolean foundPair = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    
                    System.out.println("Pair found: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    foundPair = true;
                }
            }
        }

        
        if (!foundPair) {
            System.out.println("No pairs found");
        }
    }

    }
