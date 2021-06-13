package com.kodilla.spring.basic.dependency_injection.homework;

public class DHLService implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + " by DHL.");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + " by DHL.");
    }
}
