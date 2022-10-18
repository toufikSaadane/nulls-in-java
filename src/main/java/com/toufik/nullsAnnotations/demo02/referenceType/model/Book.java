package com.toufik.nullsAnnotations.demo02.referenceType.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String title;

    public static boolean isBookReadyForPublication(Book book) {
        Objects.requireNonNull(book, "Book is null");
        System.out.println("My book :" +Objects.requireNonNull(book));
        return false;
    }
}
