package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
//        Square firstSquare = new Square(10.0);
//        Square secondSquare = new Square(5.0);
//        Square thirdSquare = new Square(1.0); // tworzymy obiekty firstSquare, secondSquare, thirdSquare
//        shapes.add(firstSquare);
//        shapes.add(secondSquare);
//        shapes.add(thirdSquare);    // dodajemy te obiekty do kolekcji

        shapes.add(new Square(10.0)); // nie trzeba tworzyć obiektów, można zapisać to wprost
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

//        for (int n = 0; n < shapes.size(); n++) {
//            Square square = shapes.get(n);
//            if (square.getArea() > 20)
//                System.out.println(square + ", area: " + square.getArea());

        for (Square square : shapes) {
            if (square.getArea() > 20)
           System.out.println(square + ", area: " + square.getArea());
        }
    }
}
