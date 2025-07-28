package br.com.learning.test;

import org.junit.jupiter.api.*;

@Order(4)
@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {

    @Test
    @DisplayName("Test A")
    void testA(){
        System.out.println("Running test A");
    }


    @Test
    @DisplayName("Test B")
    void testB(){
        System.out.println("Running test B");
    }


    @Test
    @DisplayName("Test C")
    void testC(){
        System.out.println("Running test C");
    }
}
