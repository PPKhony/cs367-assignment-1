package dev.ppkhony.lab01.Model.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "app_user") 
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String role;
    private String address;
    private String phoneNumber;
    private String numberOfBorrowBook;
    public User () {}
    public User(String name, String email, String role, String address, String phoneNumber, String numberOfBorrowBook) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberOfBorrowBook = numberOfBorrowBook;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberOfBorrowBook() {
        return numberOfBorrowBook;
    }

    public void setNumberOfBorrowBook(String numberOfBorrowBook) {
        this.numberOfBorrowBook = numberOfBorrowBook;
    }
}
