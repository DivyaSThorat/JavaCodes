package com.java;

import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private List<Book> booksWritten; // List of books written by the author

    public Author(String name) {
        this.name = name;
        this.booksWritten = new ArrayList<>();
    }

    public void addBook(Book book) {
        booksWritten.add(book);
        book.setAuthor(this); // Set the author of the book to this author
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("ABC");
        Author author2 = new Author("xyz");

        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Python Programming");

        // Establish the association between authors and books
        author1.addBook(book1);
        author2.addBook(book1); 
        author2.addBook(book2);

        
        System.out.println(author1.getName() + " wrote the following books:");
        for (Book book : author1.getBooksWritten()) {
            System.out.println("- " + book.getTitle());
        }

        System.out.println(author2.getName() + " wrote the following books:");
        for (Book book : author2.getBooksWritten()) {
            System.out.println("- " + book.getTitle());
        }
    }
}

