package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
//    przekazujemy liczbę 14, oczekujemy false,
//    przekazujemy liczbę 13, oczekujemy true,
//    przekazujemy cyfrę 2, oczekujemy true,
//    przekazujemy cyfrę 1, oczekujemy false,
//    przekazujemy cyfrę 0, oczekujemy false,
//    przekazujemy cyfrę -6, oczekujemy false.

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        assertFalse(result);
    }
}