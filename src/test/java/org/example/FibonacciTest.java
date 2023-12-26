package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
        void beforeEarch(){
        this.fibonacci = new Fibonacci();
    }

    @Test

    void testFibonacciIterative() {
        //When
        long currentResult = fibonacci.fibonacciIterative(30);
        //Then
        Assertions.assertEquals(832040, currentResult);
    }

    @Test
    void testFibonacciRecursion() {
        //When
        long currentResult = fibonacci.fibonacciRecursion(30);
        //Then
        Assertions.assertEquals(832040, currentResult);
    }

    @Test
    void testFibonacciDynamic() {
        //When
        long currentResult = fibonacci.fibonacciDynamic(30);
        //Then
        Assertions.assertEquals(832040, currentResult);
    }

}
