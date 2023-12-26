package org.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> MEMO = new HashMap<>();


    // просторова складність методу fibonacciIterative() -> O(n)
    public long fibonacciIterative(int n) throws IllegalArgumentException {

        long[] numbers = new long[]{0, 1};

        if(n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 0;
        }

        if (n > numbers.length - 1) {
            long currentNumber;
            for (int i = 1; i < n; i++) {
                currentNumber = numbers[0] + numbers[1];
                numbers[0] = numbers[1];
                numbers[1] = currentNumber;
            }
            return numbers[1];
        }
        return numbers[n];
    }

    // просторова складність методу fibonacciRecursion() -> O(2^n)
    public long fibonacciRecursion(int n) throws IllegalArgumentException {

        if(n < 0) {
            throw new IllegalArgumentException();
        } else if(n <= 1) {
            return n;
        }

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);

    }
    // просторова складність методу fibonacciDynamic() -> O(n)
    public long fibonacciDynamic(int n) {
        if(n <= 1) {
            return n;
        }
        if(MEMO.containsKey(n)) {
            return MEMO.get(n);
        }
        long result = fibonacciDynamic(n-1) + fibonacciDynamic(n-2);
        MEMO.put(n, result);
        return result;
    }
}
