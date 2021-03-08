package com.kodilla.abstracts.homework;


public class GraphicDesigner extends Job {

    public GraphicDesigner(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public double salary() {
        double salary = 8000;
        System.out.println("Salary: " + salary + "pln per month");
        return salary;
    }

    public String responsibilities() {
        String responsibilities = "creating graphic designs for printing, checking and approval of projects for printing";
        System.out.println("Responsibilities: " + responsibilities);
        return responsibilities;
    }
}
