package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class SumCalculatorTest {
     private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
       sumCalculator = new SumCalculator();
    }

    @Test
    void sumTest() {

        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
     void exceptionsTest() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(65535));
    }

}
