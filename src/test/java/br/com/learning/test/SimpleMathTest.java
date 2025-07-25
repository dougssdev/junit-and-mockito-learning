package br.com.learning.test;

import br.com.learning.math.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in SimpleMathTest Class")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Running @BeforeAll method");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Running @AfterAll method");
    }

    @BeforeEach
    void beforeEachMethod(){
         math = new SimpleMath();
    }

    //test[System under test]_[Condition or State change]_[ExpectedResult]
    @Test
    @DisplayName("Test 25 + 75 = 100")
    void testSum(){

        //Given

        Double firstNumber = 25D;
        Double secondNumber = 75D;

        //When
        Double result = math.sum(firstNumber, secondNumber);

        //Then
        assertAll(String.valueOf(result),
                () -> assertEquals(100D, result, () -> "The " + firstNumber + " + " + secondNumber  +
                        " did not reached the expected result."),
                () -> assertNotEquals(5.4D, result),
                () -> assertNotNull(result)
        );
    }

    @Test
    @DisplayName("Test 23 - 13 = 10")
    void testSubtract(){

        Double firstNumber = 23D;
        Double secondNumber = 13D;

        Double result = math.subtract(firstNumber, secondNumber);
        assertAll(String.valueOf(result),
                () -> assertNotNull(result, "not null"),
                () -> assertEquals(10D, result, () -> "Result " + result + " not expected ")
        );
    }

    @Test
    @DisplayName("Test 2 * 5 = 10")
    void testMultiply(){


        Double firstNumber = 2D;
        Double secondNumber = 5D;

        Double result = math.multiply(firstNumber, secondNumber);

        assertAll(String.valueOf(result),
            () -> assertNotEquals(12D, result),
            () ->        assertEquals(10D, result)
        );


    }


    @Test
    @DisplayName("Test 5/2 = 2.5")
    void testDivide(){

        Double firstNumber = 5D;
        Double secondNumber = 2D;

        Double result = math.divide(firstNumber, secondNumber);
        assertEquals(2.5D, result);
    }

    @Test
    @DisplayName("Test if (10+20)/2 = 15")
    void testMean(){


        Double firstNumber = 10D;
        Double secondNumber = 20D;

        Double result = math.mean(firstNumber, secondNumber);
        assertNotNull(result);
        assertEquals(15D, result);
    }

    @Test
    @DisplayName("Test if 9 square root equals 3")
    void testSquareRoot(){


        Double firstNumber = 9D;

        Double result = math.squareRoot(firstNumber);
        assertNotNull(result);
        assertEquals(3D, result);
    }

    //@Disabled("Work in Progress")
    @Test
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
