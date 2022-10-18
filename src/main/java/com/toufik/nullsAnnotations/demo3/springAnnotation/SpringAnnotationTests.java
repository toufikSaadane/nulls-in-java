package com.toufik.nullsAnnotations.demo3.springAnnotation;

import com.toufik.nullsAnnotations.demo3.springAnnotation.entity.Book;
import com.toufik.nullsAnnotations.demo3.springAnnotation.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;



public class SpringAnnotationTests {
    @Autowired
    private BookRepository repository;

    @Test
    void testGetQueryNoResultThrowsException() {
        assertThrows( EmptyResultDataAccessException.class, () -> {
            repository.getByIsbn10("invalid isbn");
        });
    }

    @Test
    void testGetQueryNullArgumentThrowsException() {
        assertThrows( IllegalArgumentException.class, () -> {
            repository.getByIsbn10(null);
        });
    }

    @Test
    void testFindQueryNoResultReturnsNull() {
        assertNull( repository.findByIsbn10("invalid isbn") );
    }

    @Test
    void testFindQueryNullArgumentThrowsException() {
        assertThrows( IllegalArgumentException.class, () -> {
            repository.findByIsbn10(null);
        });
    }

    @Test
    void testFindQueryNullArgumentAndNullReturn() {
        assertNull( repository.findByIsbn13(null) );
    }
}

