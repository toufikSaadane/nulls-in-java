package com.toufik.nullsAnnotations.demo3.lombokAnnotation.service;

import com.toufik.nullsAnnotations.demo3.lombokAnnotation.model.LombokBook;
import org.junit.Test;

public class LombokBookService {

    @Test
    public void lombokNotationTest(String[] args) {
        LombokBook book1 = new LombokBook("book");
        LombokBook book = new LombokBook(null);
        System.out.println(book1);
        System.out.println(book);
    }
}
