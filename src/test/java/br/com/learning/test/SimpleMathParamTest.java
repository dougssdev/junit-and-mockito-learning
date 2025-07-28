package br.com.learning.test;

import br.com.learning.math.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in SimpleMathTest Class")
public class SimpleMathParamTest {

     SimpleMath math;

    @BeforeEach
    void beforeEachMethod(){
         math = new SimpleMath();
    }

    @DisplayName("Parameterized testing")
    @ParameterizedTest
    //@MethodSource()
    /**
     * @CsvSource({
            "9D, 3D, 3D",
            "30D, 2D, 15D",
            "100D, 5D, 20D"
    })
    */
    @CsvFileSource(resources = "/testdivision.csv")
    void testDivide(Double firstNumber,Double secondNumber, Double expected ){

        Double result = math.divide(firstNumber, secondNumber);
        assertEquals(expected, result);

    }

    @DisplayName("Testing @ValueSource")
    @ParameterizedTest
    @ValueSource(strings = {"Juan", "Antonio", "Amen"})
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);
    }


    /**
    public static Stream<Arguments> testDivide(){
        return Stream.of(
                Arguments.of(9D, 3D, 3D),
                Arguments.of(30D, 2D, 15D),
                Arguments.of(100D, 5D, 20D)
        );
    }
    */



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
