
public class SimpleCalculator{
    public int addition(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    public int subtraction(int number1, int number2){
        int difference = number1 - number2;
        return difference;
    }

    public int multiplication(int number1, int number2){
        int product = number1 * number2;
        return product;
    }

    public double division(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) number1 / number2;
    }
}