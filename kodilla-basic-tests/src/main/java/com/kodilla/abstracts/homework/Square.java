package com.kodilla.abstracts.homework;

public class Square extends Shape {
    double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public double shapeArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double shapePerimeter() {
        return 4 * side;
    }
}