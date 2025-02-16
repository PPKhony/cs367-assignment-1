package dev.ppkhony.lab01.Controller;

import java.lang.module.ResolutionException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.ppkhony.lab01.Model.Book.Book;
import dev.ppkhony.lab01.Model.Book.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController()
public class BookController {
    private final BookRepository bookRepository;

    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    Optional<Book> getBookById(@PathVariable Long id) {
        if (bookRepository.findById(id).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");

        }
        return bookRepository.findById(id);
    }

    @PostMapping("/books")
    Book createBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }

    @PutMapping("/books/{id}")
    Book updateBook(@RequestBody Book newBook, @PathVariable Long id) {
        return bookRepository.findById(id).map(book -> {
            book.setName(newBook.getName());
            book.setCategory(newBook.getCategory());
            book.setDescription(newBook.getDescription());
            book.setAuthor(newBook.getAuthor());
            book.setPublisher(newBook.getPublisher());
            book.setPublishedDate(newBook.getPublishedDate());
            book.setPages(newBook.getPages());
            book.setLanguage(newBook.getLanguage());
            book.setIsbn(newBook.getIsbn());
            book.setShelfNumber(newBook.getShelfNumber());
            book.setStatus(newBook.getStatus());
            book.setBorrowerID(newBook.getBorrowerID());
            book.setProceedByCounterID(newBook.getProceedByCounterID());
            book.setBorrowedDate(newBook.getBorrowedDate());
            book.setReturnDate(newBook.getReturnDate());
            book.setAdditionalInfo(newBook.getAdditionalInfo());
            return bookRepository.save(book);
        }).orElseGet(() -> {
            newBook.setId(id);
            return bookRepository.save(newBook);
        });
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
