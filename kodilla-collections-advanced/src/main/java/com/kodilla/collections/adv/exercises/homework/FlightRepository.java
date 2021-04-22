package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
   static List<Flight> flights = new ArrayList<>();

   public void addFlight(String departure, String arrival) {
        Flight newFlight = new Flight(departure, arrival);
        flights.add(newFlight);
    }

    public static List<Flight> getFlightsTable(String airport) {
       List<Flight> operatedFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(airport) || flight.getDeparture().equals(airport))
                operatedFlights.add(flight);
        }
        return operatedFlights;
    }
}