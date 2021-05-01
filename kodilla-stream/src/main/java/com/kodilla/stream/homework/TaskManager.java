package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        System.out.println(taskManager.getDeadlines());
    }

    public List<LocalDate> getDeadlines() {
        return TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
                .map(task -> task.getDeadline())
                .collect(Collectors.toList());
    }
}