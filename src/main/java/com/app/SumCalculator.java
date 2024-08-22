package com.app;

public class SumCalculator {

    int sum(int n) {
        int sum = 0;

        if (n == 0) {
            throw new IllegalArgumentException();
        } else if (n >= 65535) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }

}
