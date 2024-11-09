package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ) {
        return args -> {
            Student rory = new Student(
                    "Rory",
                    22,
                    LocalDate.of(2001, 12, 5),
                    "rory@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    21,
                    LocalDate.of(2002, 12, 5),
                    "alex@gmail.com"
            );

            repository.saveAll(
                    List.of(rory, alex)
            );
        };
    }
}
