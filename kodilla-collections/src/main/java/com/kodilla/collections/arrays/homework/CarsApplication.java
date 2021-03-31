package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(20)];

        System.out.println("Wylosowano: " + cars.length);

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();

        for (Car car: cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt() * 200 + 1;
        int b = random.nextInt() * 50 + 1;
        if (drawnCarKind == 0)
            return new Opel(a, b);
        else if (drawnCarKind == 1)
            return new Ford(a, b);
        else
            return new Mercedes(a, b);
    }

}