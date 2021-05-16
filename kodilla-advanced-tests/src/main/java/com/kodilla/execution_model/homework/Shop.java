package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();

    public void addOrder(Order order) {
        if (order.getValue() > 0 && (order.getOrderTime().isBefore(endDate) || order.getOrderTime().isEqual(endDate))) {
            this.orders.add(order);
            if (this.startDate.isAfter(order.getOrderTime())) this.startDate = order.getOrderTime();
        }
    }

    public Set<Order> getOrdersFromDataToData(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(date -> date.getOrderTime().isAfter(from) && date.getOrderTime().isBefore(to))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersInValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(value -> value.getValue() >= minValue && value.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public double getOrdersValue() {
        return orders.stream()
                .map(value -> value.getValue())
                .mapToDouble(value -> value)
                .sum();
    }

    public int getSize() {
        return this.orders.size();
    }
}