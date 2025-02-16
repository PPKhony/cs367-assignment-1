package dev.ppkhony.lab01.Model.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class BookLoadDatabase {

    public static final Logger log = LoggerFactory.getLogger(BookLoadDatabase.class);

    @Bean(name = "bookInitDatabase")
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book(
                    "Effective Java",
                    "Programming",
                    "A comprehensive guide to programming in Java",
                    "Joshua Bloch",
                    "Addison-Wesley",
                    LocalDate.of(2018, 1, 6),
                    416,
                    "English",
                    "978-0134685991",
                    "A1",
                    Book.Status.AVAILABLE,
                    null,
                    null,
                    null,
                    null,
                    new HashMap<>()));

            repository.save(new Book(
                    "Clean Code",
                    "Programming",
                    "A Handbook of Agile Software Craftsmanship",
                    "Robert C. Martin",
                    "Prentice Hall",
                    LocalDate.of(2008, 8, 1),
                    464,
                    "English",
                    "978-0132350884",
                    "B2",
                    Book.Status.AVAILABLE,
                    null,
                    null,
                    null,
                    null,
                    new HashMap<>()));

            log.info("Preloaded books into the database");
        };
    }

}
