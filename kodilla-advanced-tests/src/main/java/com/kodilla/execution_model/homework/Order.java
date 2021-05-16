package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private String userLogin;
    private LocalDate orderTime;
    private int orderID;

    public Order(double value, String userName, LocalDate orderTime, int orderID) {
        this.value = value;
        this.userLogin = userName;
        this.orderTime = orderTime;
        this.orderID = orderID;
    }

    public double getValue() {
        return value;
    }

    public String getUserName() {
        return userLogin;
    }

    public LocalDate getOrderTime() {
        return orderTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(userLogin, order.userLogin) && Objects.equals(orderTime, order.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, userLogin, orderTime);
    }
}