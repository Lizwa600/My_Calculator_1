import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my simple calculator, feel free to explore and play with numbers!");
        System.out.println();
        System.out.print("Enter the 1st number of your choice: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number of your choice: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose one operator you want to use : +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error, you cannot devide by 0");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid operation, please choose one of the listed operators ");
                scanner.close();
                return;
        }

        System.out.println("Answer: " + result);
        scanner.close();
    }
}

