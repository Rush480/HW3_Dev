package com.app;

public class SumCalculator {

    int sum(int n) {
        int sum = 0;

        if (n == 0 || n < 0) {
            throw new IllegalArgumentException("Input cannot be negative or zero");
        } else if (n >= 65535) {
            throw new IllegalArgumentException("Maximum allowed value is 65535");
        } else {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }

}
