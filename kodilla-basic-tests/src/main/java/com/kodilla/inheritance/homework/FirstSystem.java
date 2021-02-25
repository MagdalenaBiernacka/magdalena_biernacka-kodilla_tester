package com.kodilla.inheritance.homework;

public class FirstSystem extends OperatingSystem {

    public FirstSystem(int creationYear) {
        super(creationYear);
        System.out.println("Creation year");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on first system");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off first system");
    }
}