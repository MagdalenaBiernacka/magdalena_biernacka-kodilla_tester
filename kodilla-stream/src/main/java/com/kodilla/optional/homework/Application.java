package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", new Teacher("Mr John")));
        students.add(new Student("Jan", new Teacher("Ms Eva")));
        students.add(new Student("Eva", null));
        students.add(new Student("Cezar", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            String teacherName =
                    optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.getName() + "/" + "Nauczyciel: " + teacherName);
        }
    }
}