package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.subtract(a, b);
        double powerResult = calculator.power(a);

        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSub = ResultChecker.assertEquals(-3, subResult);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctPower = ResultChecker.assertEquals(25, (int) powerResult);
        if (correctPower) {
            System.out.println("Metoda power działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby " + a);
        }
    }
}