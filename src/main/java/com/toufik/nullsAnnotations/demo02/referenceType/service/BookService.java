package com.toufik.nullsAnnotations.demo02.referenceType.service;

import com.toufik.nullsAnnotations.demo02.referenceType.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Slf4j
public class BookService {

    @Test
    public void bookServiceWithTryCatch(){
        Book book = new Book();
        try {
            if (book.getTitle() != null)
                log.info("Book title " + book.getTitle());

        }catch (NullPointerException exception){
            throw new NullPointerException("There is no value in getter");
        }

    }

    @Test
    public void instanceOfObject(){
        log.info("null instanceof Object: {}", (null instanceof Object));
        assertFalse(null instanceof Object);
    }
    @Test
    public void isBookReadyForPublication_test(){
        Book book = new Book();
        Book book1 = new Book("Title");
        log.info("isBookReadyForPublication : {}", Book.isBookReadyForPublication(book));
        assertFalse(Book.isBookReadyForPublication(book));
        assertFalse(Book.isBookReadyForPublication(book1));
    }
}
