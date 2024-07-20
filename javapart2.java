//Main Class (for interaction)

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View History");
            System.out.println("6. Clear History");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = scanner.nextDouble();
                    result = calculator.add(a, b);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = calculator.subtract(a, b);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = calculator.multiply(a, b);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    try {
                        result = calculator.divide(a, b);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        valid = false;
                    }
                    break;
                case 5:
                    calculator.printHistory();
                    valid = false;
                    break;
                case 6:
                    calculator.clearHistory();
                    System.out.println("History cleared.");
                    valid = false;
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }
        }
    }
}


