package dev.ppkhony.lab01.Model.Book;

import java.time.LocalDate;
import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "app_book") 
public class Book {
    @Id
    @GeneratedValue
    //Context : Book Information
    private Long id;
    private String name;
    private String category;
    private String description;
    private String author;
    private String publisher;
    private LocalDate publishedDate;
    private int pages;
    private String language;
    private String isbn;

    //Context : Book Placement
    private String shelfNumber;

    //Context : Borrowing
    public enum Status {
        BORROWED,
        AVAILABLE,
        LOSTED
    }
    private Status status;
    private String borrowerID;
    private String proceedByCounterID;
    private LocalDate borrowedDate;
    private LocalDate returnDate;
    
    private HashMap<String, String> additionalInfo = new HashMap<>();
    
    public Book() {}

    public Book(String name, String category, String description, String author, String publisher,
            LocalDate publishedDate, int pages, String language, String isbn, String shelfNumber, Status status,
            String borrowerID, String proceedByCounterID, LocalDate borrowedDate, LocalDate returnDate,
            HashMap<String, String> additionalInfo) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.pages = pages;
        this.language = language;
        this.isbn = isbn;
        this.shelfNumber = shelfNumber;
        this.status = status;
        this.borrowerID = borrowerID;
        this.proceedByCounterID = proceedByCounterID;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
        this.additionalInfo = additionalInfo;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBorrowerID() {
        return borrowerID;
    }

    public void setBorrowerID(String borrowerID) {
        this.borrowerID = borrowerID;
    }

    public String getProceedByCounterID() {
        return proceedByCounterID;
    }

    public void setProceedByCounterID(String proceedByCounterID) {
        this.proceedByCounterID = proceedByCounterID;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public HashMap<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(HashMap<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}

