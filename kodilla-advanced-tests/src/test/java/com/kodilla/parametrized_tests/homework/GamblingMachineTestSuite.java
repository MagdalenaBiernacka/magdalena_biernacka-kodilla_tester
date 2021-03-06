package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine;

    @BeforeEach
    public void setup(){
        gamblingMachine = new GamblingMachine();}

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv", numLinesToSkip = 1, delimiter = ';')
    public void isTrueWhenNumbersAreValid(String numbers) throws InvalidNumbersException {
        System.out.println(numbers);

      Set<Integer> userNumbers =  Arrays.stream(numbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
      int wins = gamblingMachine.howManyWins(userNumbers);
        System.out.println("Wins: " + wins);
        assertTrue(wins >= 1);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1, delimiter = ';')
    public void throwExceptionWhenNumbersAreInvalid(String numbers) {
        Set<Integer> userNumbers = Arrays.stream(numbers.split(";"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}