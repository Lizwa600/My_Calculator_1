import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    void additionTest(){
        //Arrange (set up the objects and variables)
        SimpleCalculator calculator = new SimpleCalculator();

        //Act (peform the action being tested)
        int actualResult = calculator.addition(2,5);

        //Assert(verify the results is as expected)
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult, "2 + 5 should equal 7");
    }
}