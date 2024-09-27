import java.util.Scanner;

public class PowersOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum exponent: ");
        int exponent = scanner.nextInt();

        int power = 1;
        int i = 0;

        do {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
            i++;
        } while (i <= exponent);

        scanner.close();
    }
}
