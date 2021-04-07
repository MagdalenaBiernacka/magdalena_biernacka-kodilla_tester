package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;


import static com.kodilla.collections.adv.maps.homework.Principal.createPrincipal;
import static com.kodilla.collections.adv.maps.homework.School.createSchool;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        school.put(createPrincipal("Jan Kowalski"), createSchool("Jedynka", 20, 20, 31, 24));
        school.put(createPrincipal("Ana Nowak"), createSchool("Dwójka", 20, 31, 25, 26, 27, 28));
        school.put(createPrincipal("Adam Xiński"), createSchool("Trójka", 30, 30, 30, 30));

        for (Map.Entry<Principal, School> principalSchoolEntry : school.entrySet())
            System.out.println("Szkoła: " + principalSchoolEntry.getValue().getSchoolName() + " / Dyrektor: " + principalSchoolEntry.getKey().getFullName() + ", liczba uczniów: " +
                    principalSchoolEntry.getValue().getStudentsNumber());
    }
}