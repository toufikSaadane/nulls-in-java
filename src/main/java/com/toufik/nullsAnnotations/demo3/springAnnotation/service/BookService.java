package com.toufik.nullsAnnotations.demo3.springAnnotation.service;


import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @NonNull
    private Integer defaultBookId;

    private void setDefaultBookId(@NonNull Integer id) {
        this.defaultBookId = null;
    }

    @NonNull
    private Integer getDefaultBookId() {
        return null;
    }

    private void processBook() {
        setDefaultBookId(null);
    }
}