package dev.ppkhony.lab01.Model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The UserLoadDatabase class is annotated with @Configuration to indicate that
 * it is a source of bean definitions. This annotation is part of the Spring
 * Framework and is used to define beans and their dependencies in a Spring
 * application context. By using @Configuration, the class can be used to
 * configure and initialize beans that will be managed by the Spring container.
 */
@Configuration
public class UserLoadDatabase {
    /**
     * The log field is a static final Logger object that is used to log messages
     * to the console. The LoggerFactory class is used to create a new Logger
     * instance, which is then assigned to the log field. The getLogger() method
     * takes the class name as an argument and returns a new Logger instance that
     * is used to log messages for that class.
     */
    public static final Logger log = LoggerFactory.getLogger(UserRepository.class);

    /**
     * The initDatabase() method is annotated with @Bean to indicate that it is a
     * source of bean definitions. This annotation is part of the Spring Framework
     * and is used to define beans and their dependencies in a Spring application
     * context. By using @Bean, the method can be used to configure and initialize
     * beans that will be managed by the Spring container.
     */
    @Bean(name = "userInitDatabase")
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new User("John Doe", "john.doe@example.com", "USER", "123 Main St", "555-1234", "0")));
            log.info("Preloading " + repository.save(new User("Jane Smith", "jane.smith@example.com", "ADMIN", "456 Elm St", "555-5678", "0")));
        };
    }

}
