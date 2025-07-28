package br.com.learning.test;

import org.junit.jupiter.api.*;

@Order(7)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrder {

    @Test
    @DisplayName("Test A")
    @Order(3)
    void testA(){
        System.out.println("Running test A");
    }


    @Test
    @DisplayName("Test B")
    @Order(1)
    void testB(){
        System.out.println("Running test B");
    }


    @Test
    @DisplayName("Test C")
    @Order(2)
    void testC(){
        System.out.println("Running test C");
    }
}
