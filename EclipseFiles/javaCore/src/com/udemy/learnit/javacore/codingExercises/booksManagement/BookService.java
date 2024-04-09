package com.udemy.learnit.javacore.codingExercises.booksManagement;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null){
            return new Book[0];
        }

        int numberOfMatchedBooks = 0;
        for (Book book: books){
            if (book.matchAuthor(author)){
                numberOfMatchedBooks++;
            }
        }

        int index = 0;
        Book[] matched_books = new Book[numberOfMatchedBooks];
        for (Book book: books){
            if (book.matchAuthor(author)){
                matched_books[index] = book;
                index++;
            }
        }
        return matched_books;
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        if (publisher == null || books == null){
            return new Book[0];
        }

        int numberOfMatchedBooks = 0;
        for (Book book: books){
            if (book.matchPublisher(publisher)){
                numberOfMatchedBooks++;
            }
        }

        int index = 0;
        Book[] matched_books = new Book[numberOfMatchedBooks];
        for (Book book: books){
            if (book.matchPublisher(publisher)){
                matched_books[index] = book;
                index++;
            }
        }
        return matched_books;
    }

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (yearFromInclusively <= 0 || books == null){
            return new Book[0];
        }
        int numberOfMatchedBooks = 0;
        for (Book book: books){
            if (book.isGreaterThanPublishYear(yearFromInclusively)){
                numberOfMatchedBooks++;
            }
        }

        int index = 0;
        Book[] matched_books = new Book[numberOfMatchedBooks];
        for (Book book: books){
            if (book.isGreaterThanPublishYear(yearFromInclusively)){
                matched_books[index] = book;
                index++;
            }
        }
        return matched_books;
    }
}
