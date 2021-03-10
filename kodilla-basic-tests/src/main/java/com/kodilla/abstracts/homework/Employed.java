package com.kodilla.abstracts.homework;

public class Employed {
    public static void main(String[] args) {
        Merchant merchant = new Merchant(7000, "sales, marketing, customer care");
        getJobParameters(merchant);

        GraphicDesigner graphicDesigner = new GraphicDesigner(8000, "creating graphic designs for printing, checking and approval of projects for printing");
        getJobParameters(graphicDesigner);

        Printer printer = new Printer(4000, "support for the production process, printing");
        getJobParameters(printer);


        Person Jan = new Person("Jan", 30, merchant);
        Person Ula = new Person("Ula", 28, graphicDesigner);
        Person Adam = new Person("Adam", 40, printer);
        Person Justyna = new Person("Justyna", 31, merchant);
        Person Michalina = new Person("Maichalina", 35, graphicDesigner);
    }

    public static void getJobParameters(Job job) {
        job.getResponsibilities();
        job.getSalary();
        System.out.println();
    }
}