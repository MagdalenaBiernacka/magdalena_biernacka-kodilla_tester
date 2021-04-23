package com.kodilla.collections.adv.exercises.homework;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    FlightRepository flightRepository;

    public FlightFinder() {
        flightRepository = new FlightRepository();
    }

    public List<Flight> findFlightsFrom(String departure) {
        return flightRepository.getFlightsTable(departure).stream()
                .filter(flight -> flight.getDeparture().equals(departure))
              .map(flight -> new Flight(flight.getDeparture(), flight.getArrival()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return flightRepository.getFlightsTable(arrival).stream()
                .filter(flight -> flight.getArrival().equals(arrival))
               .map(flight -> new Flight(flight.getDeparture(), flight.getArrival()))
                .collect(Collectors.toList());
    }
}