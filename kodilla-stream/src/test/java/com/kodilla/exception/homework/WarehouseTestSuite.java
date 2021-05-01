package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    private final Warehouse warehouse = new Warehouse();

@Test
    public void shouldThrowExceptionWhenTheOrderDoesNotExist() throws Exception {
        // Given
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        // Then
    warehouse.getOrder("10");
      assertThrows(Exception.class,
              () -> warehouse.getOrder("10"));
    }
}