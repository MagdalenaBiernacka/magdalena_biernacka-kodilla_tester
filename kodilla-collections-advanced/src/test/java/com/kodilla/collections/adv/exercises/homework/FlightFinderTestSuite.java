package com.kodilla.collections.adv.exercises.homework;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightRepository flightRepository;
    FlightFinder flightFinder;


    @BeforeEach
    public void setup() {
        flightRepository = new FlightRepository();
        flightFinder = new FlightFinder();
    }

    @Test
    public void isFlightFrom() {
        // Given
        flightRepository.addFlight("Warsaw", "Paris");
        flightRepository.addFlight("Warsaw", "Berlin");
        flightRepository.addFlight("Berlin", "Warsaw");
        flightRepository.addFlight("Paris", "Berlin");
        flightRepository.addFlight("Tenerife", "London");
        flightRepository.addFlight("Berlin", "Tenerife");
        // When
        List<Flight> flightsFrom = flightFinder.findFlightsFrom("Warsaw");
        // Then
        assertEquals(2, flightsFrom.size());
//        List<Flight> departure = new ArrayList<>();
//        departure.add(new Flight("Warsaw",  "Berlin" ));
//        assertEquals(departure, flightsFrom);
    }
    @AfterEach
    public void close() {
        flightRepository.clearList();
    }

    @Test
    public void isFlightTo() {
        // Given
        flightRepository.addFlight("Warsaw", "Paris");
        flightRepository.addFlight("Warsaw", "Berlin");
        flightRepository.addFlight("Berlin", "Warsaw");
        flightRepository.addFlight("Paris", "Berlin");
        flightRepository.addFlight("Tenerife", "London");
        flightRepository.addFlight("Berlin", "Tenerife");
        //When
        List<Flight> flightsTo = flightFinder.findFlightsTo("Berlin");
        //Then
        assertEquals(2, flightsTo.size());
    }
}