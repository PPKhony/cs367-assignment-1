package dev.ppkhony.lab01;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UrbanExplorerTools   {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String category;
    private String owner;
    private String condition;
    private boolean availability;
    private LocalDate lastUsedDate;
    private String location;
    private String specifications;
    private String notes;

    UrbanExplorerTools() {}
    
    public UrbanExplorerTools( String name, String category, String owner, String condition,
            boolean availability, LocalDate lastUsedDate, String location, String specifications, String notes) {
       
        this.name = name;
        this.category = category;
        this.owner = owner;
        this.condition = condition;
        this.availability = availability;
        this.lastUsedDate = lastUsedDate;
        this.location = location;
        this.specifications = specifications;
        this.notes = notes;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public LocalDate getLastUsedDate() {
        return lastUsedDate;
    }
    public void setLastUsedDate(LocalDate lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getSpecifications() {
        return specifications;
    }
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

   
}
