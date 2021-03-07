package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    double height;
    double sideOne;
    double sideTwo;
    double base;


    public Triangle(double height, double sideOne, double sideTwo, double base) {
        super();
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.base = base;
    }

    @Override
    public double shapeArea() {
        return (this.base*this.height)/2;
    }

    @Override
    public double shapePerimeter() {
        return this.sideOne+this.sideTwo+this.base;
    }
}