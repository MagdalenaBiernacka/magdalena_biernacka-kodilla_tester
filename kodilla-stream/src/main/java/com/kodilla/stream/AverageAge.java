package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .map(user -> user.getAge())
                .mapToInt(value -> value)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}