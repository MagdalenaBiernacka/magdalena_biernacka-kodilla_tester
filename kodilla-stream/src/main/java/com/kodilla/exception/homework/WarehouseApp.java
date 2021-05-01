package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));
        warehouse.addOrder(new Order("7"));
        warehouse.addOrder(new Order("8"));
        warehouse.addOrder(new Order("9"));

        try {
            Order order = warehouse.getOrder("1");
            System.out.println("Order: " + order);
        } catch (Exception exception) {
            System.out.println("Sorry, this order can not be found.");
        } finally {
            System.out.println("OK");
        }
    }
}
