package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("z 1997 r.", "1x2 cm", true));
        stamps.add(new Stamp("z 1992 r.", "2x2 cm", false));
        stamps.add(new Stamp("z 2001 r.", "2x2 cm", false));
        stamps.add(new Stamp("z 1997 r.", "1x2 cm", true));

        System.out.println(stamps.size());

        describeStamp(stamps);
    }

    public static void describeStamp(Set<Stamp> stamps) {
        for (Stamp stamp : stamps) {
            System.out.println("-----------------------------");
            System.out.println("Jaki znaczek? " + stamp.getStampName());
            System.out.println("Rozmiar znaczka: " + stamp.getStampSize());
            System.out.println("Czy znaczek jest ostemplowany? " + stamp.isStamped());
        }
    }
}