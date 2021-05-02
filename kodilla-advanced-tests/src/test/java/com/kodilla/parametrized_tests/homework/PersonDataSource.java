package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonDataSource {

    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(1.60, 50, "Normal (healthy weight)"),
                Arguments.of(1.70, 60, "Normal (healthy weight)"),
                Arguments.of(1.57, 70, "Overweight"),
                Arguments.of(1.80, 60, "Normal (healthy weight)"),
                Arguments.of(1.90, 150, "Obese Class III (Very severely obese)"),
                Arguments.of(1.67, 51, "Underweight"),
                Arguments.of(1.60, 100, "Obese Class II (Severely obese)"),
                Arguments.of(1.69,45, "Severely underweight")
        );
    }
}
