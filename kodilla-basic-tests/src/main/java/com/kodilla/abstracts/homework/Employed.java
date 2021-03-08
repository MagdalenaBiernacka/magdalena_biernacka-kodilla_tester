package com.kodilla.abstracts.homework;

public class Employed {
    public static void main(String[] args) {
        Job merchant = new Merchant(7000, "sales, marketing, customer care");
        merchant.getResponsibilities();
        merchant.getSalary();
        System.out.println();

        Job graphicDesigner = new GraphicDesigner(8000, "creating graphic designs for printing, checking and approval of projects for printing");
        graphicDesigner.getResponsibilities();
        graphicDesigner.getSalary();
        System.out.println();

        Job printer = new Printer(400, "support for the production process, printing");
        printer.getSalary();
        printer.getResponsibilities();


        Person Jan = new Person("Jan", 30, merchant);
        Person Ula = new Person("Ula", 28, graphicDesigner);
        Person Adam = new Person("Adam", 40, printer);
        Person Justyna = new Person("Justyna", 31, merchant);
        Person Michalina = new Person("Maichalina", 35, graphicDesigner);
    }
}
