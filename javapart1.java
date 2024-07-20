
//Calculator Class

import java.util.ArrayList;

public class Calculator {
    private ArrayList<String> history; // ArrayList to store history of operations

    public Calculator() {
        history = new ArrayList<>();
    }

    public double add(double a, double b) {
        double result = a + b;
        String operation = String.format("%.2f + %.2f = %.2f", a, b, result);
        history.add(operation);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        String operation = String.format("%.2f - %.2f = %.2f", a, b, result);
        history.add(operation);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        String operation = String.format("%.2f * %.2f = %.2f", a, b, result);
        history.add(operation);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        double result = a / b;
        String operation = String.format("%.2f / %.2f = %.2f", a, b, result);
        history.add(operation);
        return result;
    }

    public void clearHistory() {
        history.clear();
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("No operations performed yet.");
        } else {
            System.out.println("Operation History:");
            for (String operation : history) {
                System.out.println(operation);
            }
        }
    }
}

