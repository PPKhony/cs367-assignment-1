package dev.ppkhony.lab01.Controller;

import java.lang.module.ResolutionException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.ppkhony.lab01.Model.Book.Book;
import dev.ppkhony.lab01.Model.Book.BookRepository;
import dev.ppkhony.lab01.Model.User.User;
import dev.ppkhony.lab01.Model.User.UserRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController()
public class UserController {

    private final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User updatedUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setEmail(updatedUser.getEmail());
                    user.setRole(updatedUser.getRole());
                    user.setAddress(updatedUser.getAddress());
                    user.setPhoneNumber(updatedUser.getPhoneNumber());
                    user.setNumberOfBorrowBook(updatedUser.getNumberOfBorrowBook());
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        userRepository.deleteById(id);
    }

}