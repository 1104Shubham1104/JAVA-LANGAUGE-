import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score: ");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A (Excellent)");
                break;
            case 8:
                System.out.println("B (Very Good)");
                break;
            case 7:
                System.out.println("C (Good)");
                break;
            case 6:
                System.out.println("D (Satisfactory)");
                break;
            default:
                if (score < 60 && score >= 0) {
                    System.out.println("F (Fail)");
                } else {
                    System.out.println("Invalid score.");
                }
                break;
        }

        scanner.close();
    }
}
