package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    double sideOne;
    double sideTwo;

    public Rectangle(double sideOne, double sideTwo){
        super();
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double shapeArea() {
        return sideOne*sideTwo;
    }

    @Override
    public double shapePerimeter() {
        return 2*(sideOne+sideTwo);
    }
}
