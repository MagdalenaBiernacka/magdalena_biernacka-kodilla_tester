package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("task 1", LocalDate.of(2021, 04, 28),LocalDate.of(2021, 04, 29)));
        tasks.add(new Task("task 2", LocalDate.of(2021, 04, 1), LocalDate.of(2021, 05, 3)));
        tasks.add(new Task("task 3", LocalDate.of(2021, 04, 26), LocalDate.of(2021, 06, 1)));
        tasks.add(new Task("task 4", LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 2)));
        return tasks;
    }
}
