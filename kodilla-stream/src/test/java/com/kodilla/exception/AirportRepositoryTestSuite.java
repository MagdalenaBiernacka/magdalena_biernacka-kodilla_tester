package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuite {
   AirportRepository airportRepository = new AirportRepository();

   @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
       assertTrue(airportRepository.isAirportInUse("Warsaw"));
   }

   @Test
   public void testIsAirportInUse_withException(){
      assertThrows(AirportNotFoundException.class,
              () -> airportRepository.isAirportInUse("Vienna"));
   }
}