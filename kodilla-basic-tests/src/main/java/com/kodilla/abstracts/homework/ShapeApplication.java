package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 5, 4, 3);
        System.out.println("The area of the triangle is " + triangle.shapeArea());
        System.out.println("The perimeter of the triangle is " + triangle.shapePerimeter());

        Square square = new Square(10);
        System.out.println("The area of the square is " + square.shapeArea());
        System.out.println("The perimeter of the square is " + square.shapePerimeter());

        Rectangle rectangle = new Rectangle(8, 4);
        System.out.println("The area of the rectangle is " + rectangle.shapeArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.shapePerimeter());
    }
}