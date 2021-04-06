package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String fullName;


    public Principal(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    static Principal createPrincipal(String name) {
        return new Principal(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(fullName, principal.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}