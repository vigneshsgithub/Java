import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double greatestNumber = findGreatestNumber(num1, num2, num3);

        System.out.println("The greatest number is: " + greatestNumber);
    }

    public static double findGreatestNumber(double a, double b, double c) {
        double greatest = a;

        if (b > greatest) {
            greatest = b;
        }

        if (c > greatest) {
            greatest = c;
        }

        return greatest;
    }
}