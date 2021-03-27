package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        System.out.println("Ford speed:");
        doRace(ford);

        Opel opel = new Opel();
        System.out.println("Opel speed:");
        doRace(opel);

        Mercedes mercedes = new Mercedes();
        System.out.println("Mercedes speed:");
        doRace(mercedes);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}