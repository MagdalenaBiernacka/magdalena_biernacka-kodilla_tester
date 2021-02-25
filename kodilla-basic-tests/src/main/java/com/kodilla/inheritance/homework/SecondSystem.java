package com.kodilla.inheritance.homework;

public class SecondSystem extends OperatingSystem {

    public SecondSystem(int creationYear) {
        super(creationYear);
        System.out.println("Second system's creation year");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on second system");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off second system");
    }
}