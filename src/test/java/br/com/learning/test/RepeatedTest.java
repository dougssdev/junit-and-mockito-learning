package br.com.learning.test;

import br.com.learning.math.SimpleMath;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath();
    }

    @org.junit.jupiter.api.RepeatedTest(3)
    @DisplayName("Test if its throwing an exception")
    void testDivide_When_NumberIsDividedByZero_ShouldThrowArithmeticException(){

        Double firstNumber = 10D;
        Double secondNumber = 0D;

        String expectedMessage = "Impossible to divide by zero";

        ArithmeticException actual =  assertThrows(ArithmeticException.class, () -> {
            math.divide(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message");

    }
}
