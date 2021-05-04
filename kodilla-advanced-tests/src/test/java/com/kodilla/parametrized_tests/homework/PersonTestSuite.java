package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonDataSource#provideDataForTestingBMI")
    public void returnProperInformationToTheGivenBMI(double heightInMeters, double weightInKilograms, String information) {
        Person person = new Person(heightInMeters, weightInKilograms);
        assertEquals(information, person.getBMI());
    }
}