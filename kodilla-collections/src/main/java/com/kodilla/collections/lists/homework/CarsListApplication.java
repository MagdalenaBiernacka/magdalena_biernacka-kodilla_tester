package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Opel> cars = new ArrayList<>();
        Opel opel = new Opel(30, 20);
        cars.add(opel);

        cars.add(new Opel(90, 80));
        cars.add(new Opel(79, 60));
        cars.add(new Opel(100, 50));

        describe(cars);

        cars.remove(1);
        cars.remove(opel);

       describe(cars);
       System.out.println("Po usunięciu dwóch samochodów pozostało: " + cars.size());
        }

    private static void describe(List<Opel> cars) {
        for (Opel car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
