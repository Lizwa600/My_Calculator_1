import java.util.Scanner;

public class SimpleCalculator {

    public static double calculate(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;

            case '-':
                return number1 - number2;

            case '*':
                return number1 * number2;

            case '/':
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }

            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my simple calculator, feel free to explore and play with numbers!");
        System.out.println();

        System.out.print("Enter the 1st number of your choice: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number of your choice: ");
        double number2 = scanner.nextDouble();

        System.out.println("Choose one operator you want to use : +, -, *, /");
        char operation = scanner.next().charAt(0);

        try {
            double result = calculate(number1, number2, operation);
            System.out.println("Answer: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
