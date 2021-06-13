package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {
    Shop shop = new Shop();
    Order firstOrder = new Order(122.33, "Magda", LocalDate.of(2021, 04, 15), 1);
    Order secondOrder = new Order(55, "Jan", LocalDate.of(2021, 05, 1), 2);
    Order thirdOrder = new Order(12, "Ola", LocalDate.of(2021, 05, 2), 3);
    Order fourthOrder = new Order(12, "Natalia", LocalDate.of(2021, 05, 3), 4);
    Order fifthOrder = new Order(12, "Ola", LocalDate.of(2021, 10, 2), 5);
    Order sixthOrder = new Order(-15, "Paulina", LocalDate.of(2021, 05, 15), 6);

    @BeforeEach
    public void setup() {
        shop.addOrder(firstOrder);
        shop.addOrder(secondOrder);
        shop.addOrder(thirdOrder);
        shop.addOrder(fourthOrder);
        shop.addOrder(fifthOrder);
        shop.addOrder(sixthOrder);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void areOrdersAdded() {
        assertEquals(4, shop.getSize());
    }

    @Test
    public void areOrdersFromDataToData() {
        //Given
        Set<Order> ordersFromDataToData = new HashSet<>(); //od 15.04, do dzisiaj
        ordersFromDataToData.add(firstOrder);
        ordersFromDataToData.add(secondOrder);
        ordersFromDataToData.add(thirdOrder);

        //When
        int filteredOrdersByDate = shop.getOrdersFromDataToData(LocalDate.of(2021, 04, 15),
                LocalDate.now()).size();
        //Then
        assertEquals(ordersFromDataToData.size(), filteredOrdersByDate);
    }

    @Test
    public void returnEmptyListWhenNoOrdersInValueRange() {
        //Given
        //when
        Set<Order> emptySet = shop.getOrdersInValueRange(200, 300);
        //Then
        assertEquals(Collections.EMPTY_SET, emptySet);
    }

    @Test
    public void areOrdersWithProperValueRange() {
        //Given
        //When
        int filteredOrdersByValue = shop.getOrdersInValueRange(50, 200).size();
        //Then
        assertEquals(2, filteredOrdersByValue);
    }

    @Test
    public void isTheValueOfOrdersAddedUp() {
        //Given
        //When
        double sumOrdersValue = shop.getOrdersValue();
        //Then
        assertEquals(201.33, sumOrdersValue, 0.01);
    }
}