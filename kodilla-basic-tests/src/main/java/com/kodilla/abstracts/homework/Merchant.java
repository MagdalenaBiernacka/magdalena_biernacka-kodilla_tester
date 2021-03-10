package com.kodilla.abstracts.homework;

public class Merchant extends Job {

    public Merchant(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public double getSalary() {
        System.out.println("Salary: " + salary + "pln per month");
        return salary;
    }

    @Override
    public String getResponsibilities() {
        System.out.println("Responsibilities: " + responsibilities);
        return responsibilities;
    }
}