package com.kodilla.inheritance.homework;

public class App {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1997);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        FirstSystem firstSystem = new FirstSystem(1995);
        firstSystem.turnOn();
        firstSystem.displayYear();
        firstSystem.turnOff();

        SecondSystem secondSystem = new SecondSystem(2000);
        secondSystem.turnOn();
        secondSystem.displayYear();
        secondSystem.turnOff();
    }
}
