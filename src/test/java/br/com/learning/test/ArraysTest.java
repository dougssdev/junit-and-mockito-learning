package br.com.learning.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
@Order(5)
public class ArraysTest {

    @Test
    @DisplayName("Comparing arrays test")
    void test(){
        //Given
        int[] numbers = {23,5,86,69};
        int[] expected = {5,23,69,86};

        //When
        Arrays.sort(numbers);

        //Then
        assertArrayEquals(expected, numbers);
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance(){
        int[] numbers = {23,5,86,69};

        for (int i = 0; i < 1000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
