package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        System.out.println("Przed dodaniem do Seta" + newBook.hashCode());
        books.add(newBook);
        books.forEach(book -> System.out.println(book.hashCode()));
        return newBook;
    }
}