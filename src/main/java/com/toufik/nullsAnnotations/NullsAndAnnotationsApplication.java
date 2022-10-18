package com.toufik.nullsAnnotations;

import com.toufik.nullsAnnotations.demo3.springAnnotation.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NullsAndAnnotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NullsAndAnnotationsApplication.class, args);
    }

    @Bean
    CommandLineRunner init(BookRepository repository) {
		return args -> {
			String isbn = "1234567899";c
			System.out.println( repository.getByIsbn10(isbn) );
		};
	}
}
