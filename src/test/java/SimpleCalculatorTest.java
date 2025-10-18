import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    void AddTwoNumbers() {
        // Arrange
        double number1 = 5;
        double number2 = 3;
        char operator = '+';

        // Act
        double result = SimpleCalculator.calculate(number1, number2, operator);

        // Assert
        assertEquals(8, result);
    }
}

