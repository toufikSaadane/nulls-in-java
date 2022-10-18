package com.toufik.nullsAnnotations.demo3.springAnnotation.repository;

import com.toufik.nullsAnnotations.demo3.springAnnotation.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book getByIsbn10(String isbn10);

    @Nullable
    Book findByIsbn10(String isbn10);

    @Nullable
    Book findByIsbn13(@Nullable String isbn13);

}
