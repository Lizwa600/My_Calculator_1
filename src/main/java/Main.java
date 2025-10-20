import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to my Simple Calculator!, feel free to explore and play with numbers");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        int result = 0;
        
        switch (choice) {
            case 1:
                result = calculator.addition(number1, number2);
                System.out.println("Sum: " + result);
                break;
            case 2:
                result = calculator.subtraction(number1, number2);
                System.out.println("Difference: " + result);
                break;
            case 3:
                result = calculator.multiplication(number1, number2);
                System.out.println("Product: " + result);
                break;
            case 4:
                try {
                    result = calculator.division(number1, number2);
                    System.out.println("Quotient: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
