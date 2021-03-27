package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    int speed = 0;
    int increase = 30;
    int decrease = 5;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increase;
    }

    @Override
    public void decreaseSpeed() {
        if (speed >= decrease) {
            speed = speed - decrease;
        } else {
            speed = 0;
        }
    }
}