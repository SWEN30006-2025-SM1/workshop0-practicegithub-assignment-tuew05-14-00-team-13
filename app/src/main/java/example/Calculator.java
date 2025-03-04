package example;

public class Calculator {
    public int add(int a, int b) {
        // TODO: Implement this method
        return a+b;
    }

    public int minus(int a, int b) {
        // TODO: Implement this method
        return a - b;
    }

    public int multiply(int a, int b) {
        // TODO: Implement this method
        return a * b;
    }

    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
}
