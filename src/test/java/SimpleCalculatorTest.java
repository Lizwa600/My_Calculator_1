import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleCalculatorTest {
    @Test
    void additionTest() {
        //Arrange (set up the objects and variables)
        SimpleCalculator calculator = new SimpleCalculator();

        //Act (perform the action being tested)
        int actualResult = calculator.addition(2, 5);

        //Assert(verify the results is as expected)
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult, "2 + 5 should equal 7");
    }

    @Test
    void subtractionTest() {
        //Arrange (set up the objects and variables)
        SimpleCalculator calculator = new SimpleCalculator();

        //Act (perform the action being tested)
        int actualResult = calculator.subtraction(5, 2);

        //Assert(verify the results is as expected)
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult, "5 - 2 should equal 3");
    }

    @Test
    void multiplicationTest() {

        //Arrange (set up the objects and variables)
        SimpleCalculator calculator = new SimpleCalculator();

        //Act (perform the action being tested)
        int actualResult = calculator.multiplication(5, 2);

        //Assert(verify the results is as expected)
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult, "5 * 2 should equal 10");
    }
    @Test
    void divisionTest(){
        //Arrange (set up the objects and variables)
        SimpleCalculator calculator = new SimpleCalculator();

        //Act (perform the action being tested)
        int actualResult = calculator.division(5, 2);


        //Assert(verify the results is as expected)
        int expectedResult =2;
        assertEquals(expectedResult, actualResult, "5 / 2 should equal 2.5");

    }

//    @Test
//    void divisionZeroTest() {
//        // Arrange
//        SimpleCalculator calculator = new SimpleCalculator();
//
//        // Act  (perform the action being tested)
//        double actualResult = calculator.division(5, 0);
//
//        //Assert(verify the results is as expected)
//        throw new ArithmeticException("Cannot divide by zero");
//
//    }
}
