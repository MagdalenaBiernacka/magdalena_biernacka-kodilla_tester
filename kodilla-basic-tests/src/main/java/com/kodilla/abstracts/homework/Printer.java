package com.kodilla.abstracts.homework;

public class Printer extends Job {

    public Printer(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public double salary() {
        double salary = 4000;
        System.out.println("Salary: " + salary + "pln per month");
        return salary;
    }

    public String responsibilities() {
        String responsibilities = "support for the production process, printing";
        System.out.println("Responsibilities: " + responsibilities);
        return responsibilities;
    }
}