public class SumOfDigits {

    // Method to compute and print the sum of digits
    public static void printSumOfDigits(int number) {
        // Ensure the number is positive
        number = Math.abs(number);

        // Initialize sum
        int sum = 0;

        // Loop through each digit
        while (number > 0) {
            // Add the last digit to the sum
            sum += number % 10;
            // Remove the last digit from the number
            number /= 10;
        }

        // Print the result
        System.out.println("Sum of digits: " + sum);
    }

    public static void main(String[] args) {
        // Test the method with a sample number
        int number = 12345;
        printSumOfDigits(number);  // Output should be 15
    }
}
