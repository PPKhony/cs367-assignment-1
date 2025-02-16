# CS367 Web Development Service : Assignment 1

## Problem Statement

When we manage a library, we need to store books in specific locations and remember where they are stored. When these books are borrowed by users, we need to keep track of who borrowed them and when. If a book is returned, we should know that it has been returned and where it is stored again.

Manually recording and tracking these details can be cumbersome. Therefore, we need a system to manage this process efficiently.

## How to Run

This project was clean already.
To build and run the project, follow these steps:

1. **Navigate to the project directory**:
    ```sh
    cd ./Assignment-1
    ```

2. **Build the project using Maven**:
    ```sh
    mvn install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

Make sure you have Maven installed and properly configured on your system before running these commands.

## Attributes

### Book Attributes
- **id**: Unique identifier for the book.
- **name**: Name of the book.
- **category**: Category or genre of the book.
- **description**: Brief description of the book.
- **author**: Author of the book.
- **publisher**: Publisher of the book.
- **publishedDate**: Date when the book was published.
- **pages**: Number of pages in the book.
- **language**: Language in which the book is written.
- **isbn**: International Standard Book Number.
- **shelfNumber**: Shelf number where the book is placed.
- **status**: Current status of the book (BORROWED, AVAILABLE, LOSTED).
- **borrowerID**: ID of the user who borrowed the book.
- **proceedByCounterID**: ID of the counter that processed the borrowing.
- **borrowedDate**: Date when the book was borrowed.
- **returnDate**: Date when the book is expected to be returned.
- **additionalInfo**: Additional information about the book.

### User Attributes
- **id**: Unique identifier for the user.
- **name**: Name of the user.
- **email**: Email address of the user.
- **role**: Role of the user (e.g., student, teacher).
- **address**: Address of the user.
- **phoneNumber**: Phone number of the user.
- **numberOfBorrowBook**: Number of books currently borrowed by the user.
