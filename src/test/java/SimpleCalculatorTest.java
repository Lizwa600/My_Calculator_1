import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    void additionTest(){
        //Arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        //Act
        int result = simpleCalculator.addition(2,5);

        //Assert
        assertEquals(7, result, "");
    }
}