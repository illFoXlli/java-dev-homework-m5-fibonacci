package com.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {

    private static final Map<Integer, Long> cache = new HashMap<>();

    public static long fib(int n) {
        if (n <= 1) return (long) n;

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);

        return result;
    }
}