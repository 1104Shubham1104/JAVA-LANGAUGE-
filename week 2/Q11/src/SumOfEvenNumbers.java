import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int i = 2;

        do {
            if (i <= number) {
                sum += i;
            }
            i += 2;
        } while (i <= number);

        System.out.println("The sum of even numbers from 1 to " + number + " is " + sum);
    }
}

