package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int creationYear;

    public OperatingSystem(int creationYear) {
        this.creationYear = creationYear;
    }

    public void turnOn() {
        System.out.println("Turn on");
    }

    public void turnOff() {
        System.out.println("Turn off");
    }

    public void displayYear() {
        System.out.println("Creation year: " + creationYear);
    }
}