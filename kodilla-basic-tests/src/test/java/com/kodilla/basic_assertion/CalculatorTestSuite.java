package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int subResult = calculator.subtract(a, b);
        assertEquals(5, subResult);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int a = 10;
        int powerResult = calculator.power(a);
        assertEquals(100, powerResult);
    }

    @Test
    public void testPowerForNegativeNumbers() {
        Calculator calculator = new Calculator();
        int a = -2;
        int powerResult = calculator.power(a);
        assertEquals(4, powerResult);
    }

    @Test
    public void testPowerForZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int powerResult = calculator.power(a);
        assertEquals(0, powerResult);
    }
}