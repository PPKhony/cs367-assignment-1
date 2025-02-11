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
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Handheld Radio", "Communication", "John Doe", "New", true, LocalDate.now(), "Communication Tools", "Motorola", "Communication without cellular signal")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Climbing Rope & Carabiners", "Climbing", "Jane Doe", "New", true, LocalDate.now(), "Climbing Gear", "Petzl", "For accessing difficult locations")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Thermal Imaging Camera", "Detection", "John Doe", "New", true, LocalDate.now(), "Detection Tools", "FLIR", "Detects heat signatures in dark areas")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Geiger Counter", "Detection", "Jane Doe", "New", true, LocalDate.now(), "Detection Tools", "GCA-07W", "Measures radiation levels in hazardous zones")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Air Quality Detector", "Detection", "John Doe", "New", true, LocalDate.now(), "Detection Tools", "CO2 Meter", "Ensures breathable air")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Motion Sensor", "Detection", "Jane Doe", "New", true, LocalDate.now(), "Detection Tools", "PIR", "Detects movement in low light")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("GoPro", "Documentation", "John Doe", "New", true, LocalDate.now(), "Documentation Tools", "Hero9", "Captures POV footage in rugged environments")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("360° Camera", "Documentation", "Jane Doe", "New", true, LocalDate.now(), "Documentation Tools", "Insta360", "For immersive urban exploration shots")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Portable Drone", "Documentation", "John Doe", "New", true, LocalDate.now(), "Documentation Tools", "DJI Mini", "Scouting inaccessible areas from above")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Field Notebook & Waterproof Pen", "Documentation", "Jane Doe", "New", true, LocalDate.now(), "Documentation Tools", "Rite in the Rain", "Logs details without relying on tech")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("UV Flashlight", "Documentation", "John Doe", "New", true, LocalDate.now(), "Documentation Tools", "UV Beast", "Reveals hidden markings, graffiti, or biological traces")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("First Aid Kit", "Emergency", "Jane Doe", "New", true, LocalDate.now(), "Emergency Gear", "Standard", "Bandages, antiseptics, painkillers, and trauma tools")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Firestarter & Waterproof Matches", "Emergency", "John Doe", "New", true, LocalDate.now(), "Emergency Gear", "Standard", "In case of emergencies")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Portable Water Filter", "Emergency", "Jane Doe", "New", true, LocalDate.now(), "Emergency Gear", "LifeStraw", "Purifies water from unsafe sources")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Space Blanket", "Emergency", "John Doe", "New", true, LocalDate.now(), "Emergency Gear", "Standard", "Prevents hypothermia")));
            log.info("Preloading " + repository.save(new UrbanExplorerTools("Paracord Bracelet & Wire Saw", "Emergency", "Jane Doe", "New", true, LocalDate.now(), "Emergency Gear", "Standard", "Multi-use survival tools")));
        };
    }
    
}
