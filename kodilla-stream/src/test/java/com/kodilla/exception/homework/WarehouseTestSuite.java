package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    private final Warehouse warehouse = new Warehouse();

@Test
    public void shouldThrowExceptionWhenTheOrderDoesNotExist() throws OrderDoesntExistException {
        // Given
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        // Then
      assertThrows(OrderDoesntExistException.class,
              () -> {warehouse.getOrder("10");});
    }
}