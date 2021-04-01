package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    static Car[] cars;
    static Random random;

    public static void main(String[] args) {
        random = new Random();
        generateCars();
        displayCarData(cars);
    }

    public static Car drawCar() {
        int drawnCarKind = random.nextInt(3);
        System.out.println("Wylosowano: " + cars.length);
        int a = random.nextInt(200) + 1;
        int b = random.nextInt(50) + 1;
        if (drawnCarKind == 0)
            return new Opel(a, b);
        else if (drawnCarKind == 1)
            return new Ford(a, b);
        else
            return new Mercedes(a, b);
    }

    public static void displayCarData(Car[] cars) {
        for (Car car: cars) {
            car = drawCar();
            car.increaseSpeed();
            car.decreaseSpeed();
            CarUtils.describeCar(car);
        }
    }

    public static void generateCars() {
        cars = new Car[random.nextInt(20)];
        if (cars.length == 0) {
            System.out.println( "Wylosowano 0, ponowne losowanie");
            cars = new Car[random.nextInt(20)];
        }
    }
}