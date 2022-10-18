package com.toufik.nullsAnnotations.demo3.lombokAnnotation.model;

import lombok.NonNull;

public class LombokBook {
    private String title;

    public LombokBook(@NonNull String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LombokBook : [" +
                "title='" + title + '\'' +
                ']';
    }
}
