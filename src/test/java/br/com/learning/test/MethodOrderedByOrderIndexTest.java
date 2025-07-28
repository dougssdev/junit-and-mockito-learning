package br.com.learning.test;

import org.junit.jupiter.api.*;

//@Order(7)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {

    StringBuilder value = new StringBuilder("");

    @AfterEach
    void afterEach(){
        System.out.println("The actual value is: " + value);
    }

    @Test
    @DisplayName("Test A")
    @Order(3)
    void testA(){
        System.out.println("Running test A");
        value.append("1");
    }


    @Test
    @DisplayName("Test B")
    @Order(1)
    void testB(){
        System.out.println("Running test B");
        value.append("2");
    }


    @Test
    @DisplayName("Test C")
    @Order(2)
    void testC(){
        System.out.println("Running test C");
        value.append("3");
    }
}
