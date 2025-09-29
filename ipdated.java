// CalculatorMain.java
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Modular Calculator (+, -, *, /) ===");

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        if (!calculator.supports(operator)) {
            System.out.println("Operation not supported!");
            scanner.close();
            return;
        }

        try {
            double result = calculator.calculate(operator, a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}