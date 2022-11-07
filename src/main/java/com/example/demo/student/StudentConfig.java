package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@email.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student maria = new Student(
                    "Maria",
                    "maria@email.com",
                    LocalDate.of(2007, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(john, maria)
            );

        };
    }
}
