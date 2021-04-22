package com.kodilla.collections.adv.exercises.homework;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        return FlightRepository.getFlightsTable(departure).stream()
                .filter(flight -> flight.getDeparture().equals(departure))
              .map(flight -> new Flight(flight.getDeparture(), flight.getArrival()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return FlightRepository.getFlightsTable(arrival).stream()
                .filter(flight -> flight.getArrival().equals(arrival))
               .map(flight -> new Flight(flight.getDeparture(), flight.getArrival()))
                .collect(Collectors.toList());
    }
}