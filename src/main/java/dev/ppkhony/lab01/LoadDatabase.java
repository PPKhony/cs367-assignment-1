package dev.ppkhony.lab01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class LoadDatabase {
    
    public static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(UrbanExplorerToolsRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new UrbanExplorerTools("High-Lumen Headlamp", "Lighting", "John Doe", "New", true, LocalDate.now(), "Storage Room", "1000 lumens", "Hands-free lighting for dark environments")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Tactical Flashlight", "Lighting", "Jane Doe", "Used", true, LocalDate.now(), "Storage Room", "500 lumens", "Powerful beam with strobe mode for signaling")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Multi-Tool", "Tool", "John Doe", "New", true, LocalDate.now(), "Toolbox", "Leatherman", "Knife, pliers, screwdriver, and more")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Cut-Resistant Gloves", "Safety", "Jane Doe", "New", true, LocalDate.now(), "Safety Gear", "Kevlar", "Protection from sharp metal, glass, or debris")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Respirator Mask", "Safety", "John Doe", "New", true, LocalDate.now(), "Safety Gear", "N95", "Filters dust, mold, and toxic air")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("GPS Device", "Navigation", "Jane Doe", "New", true, LocalDate.now(), "Navigation Tools", "Garmin", "Offline tracking in unknown areas")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Compass & Physical Maps", "Navigation", "John Doe", "New", true, LocalDate.now(), "Navigation Tools", "Standard", "Backup for electronic failures")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Laser Distance Measurer", "Navigation", "Jane Doe", "New", true, LocalDate.now(), "Navigation Tools", "Bosch", "Measures distances in abandoned buildings")));
        };
    }
    
}
