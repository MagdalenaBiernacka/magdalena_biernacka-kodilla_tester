package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgForMoreThen40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()>= 40)
                .map(user -> user.getNumberOfPost())
                .mapToInt(value -> value)
                .average()
                .getAsDouble();
        System.out.println("średnia liczba postów dla użytkowników powyżej 40-roku życia: " + avgForMoreThen40);

        double avgForLessThen40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()< 40)
                .map(user -> user.getNumberOfPost())
                .mapToInt(value -> value)
                .average()
                .getAsDouble();
        System.out.println("średnia liczba postów dla użytkowników poniżej 40-roku życia: " + avgForLessThen40);
    }
}