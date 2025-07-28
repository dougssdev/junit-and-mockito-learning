package br.com.learning.test;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(6)
public class SimpleTest {

    @Test
    void test(){
        System.out.println("Hello JUnit 5");
    }
}
