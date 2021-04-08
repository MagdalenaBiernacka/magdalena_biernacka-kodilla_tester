package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Ksiązka1", "Ttuł1");
        Book book2 = BookManager.createBook("Ksiązka1", "Ttuł1");
        Book book3 = BookManager.createBook("Ksiązka2", "Ttuł2");

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}